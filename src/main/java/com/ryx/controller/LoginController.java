package com.ryx.controller;

import com.alibaba.fastjson.JSON;
import com.ryx.common.api.CommonResult;
import com.ryx.model.User;
import com.ryx.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 登陆Controller
 */
@Api(tags = "LoginController", description = "登陆管理")
@RestController
public class LoginController {
    @Autowired
    LoginService loginService;

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @ApiOperation(value="用户登陆", notes="根据用户名+密码+渠道商号登陆")
    @PostMapping("login")
    public CommonResult login(@RequestParam(required = true) String phone,
                                    @RequestParam(required = true) String password
                                    ) {
        try {
            User user = loginService.queryUserByPhoneAndPwd(phone, password);
            if (user == null) {
                return CommonResult.failed("用户名或密码错误！");
            } else {
                String token = loginService.login(phone, password);
                if (token == null) {
                    return CommonResult.validateFailed("用户名或密码错误");
                }
                Map<String, Object> tokenMap = new HashMap<String, Object>();
                tokenMap.put("token", token);
                tokenMap.put("tokenHead", tokenHead);
                tokenMap.put("user" , JSON.toJSON(user));
                return CommonResult.success(tokenMap);
            }
        } catch (Exception e) {
            LOGGER.debug("createBrand failed:{}", e.toString());
            return CommonResult.failed("登陆时发生错误！");
        }
    }

    @ApiOperation("获取验证码")
    @RequestMapping(value = "/getAuthCode", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getAuthCode(@RequestParam String telephone) {
        return loginService.generateAuthCode(telephone);
    }

    @ApiOperation("判断验证码是否正确")
    @RequestMapping(value = "/verifyAuthCode", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updatePassword(@RequestParam String telephone,
                                       @RequestParam String authCode) {
        return loginService.verifyAuthCode(telephone,authCode);
    }
}
