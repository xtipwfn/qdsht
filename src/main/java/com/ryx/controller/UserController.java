package com.ryx.controller;

import com.ryx.common.api.CommonPage;
import com.ryx.common.api.CommonResult;
import com.ryx.common.util.JwtTokenUtil;
import com.ryx.dto.AdminUserDetails;
import com.ryx.model.User;
import com.ryx.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;
import java.util.List;

/**
 * 用户管理
 */
@Api(tags = "UserController", value = "用户管理")
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    UserService userService;

    @ApiOperation("根据姓名或手机号查询本渠道下属用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", dataType = "Integer", defaultValue = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条数，可为空默认10", dataType = "Integer", defaultValue = "10", paramType = "query"),
            @ApiImplicitParam(name = "phone", value = "手机号", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "xm", value = "姓名", dataType = "String", paramType = "query")})
    @PostMapping("/querySubordinateUsers")
    @ResponseBody
    public CommonResult<CommonPage<User>> querySubordinateUsers(Integer pageNum,
                                                                Integer pageSize,
                                                                String phone,
                                                                String xm) {
        //获取用户信息
        AdminUserDetails user = (AdminUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<User> UserPage = userService.querySubordinateUsers(user.getQds(), phone, xm, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(UserPage));
    }
    @ApiOperation("修改用户信息")
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateUser( @RequestBody User user) {
        int count = userService.updateUser(user);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }
}
