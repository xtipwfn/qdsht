package com.ryx.controller;

import com.ryx.common.api.CommonPage;
import com.ryx.common.api.CommonResult;
import com.ryx.common.util.JwtTokenUtil;
import com.ryx.dto.AdminUserDetails;
import com.ryx.model.Prod;
import com.ryx.model.User;
import com.ryx.service.ProdService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 产品管理
 */
@Api(tags = "ProdController", value = "产品管理")
@Controller
@RequestMapping("/prod")
public class ProdController {
    @Autowired
    ProdService prodService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @ApiOperation("根据产品名称查询产品列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", dataType = "Integer", defaultValue = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条数，可为空默认10", dataType = "Integer", defaultValue = "10", paramType = "query"),
            @ApiImplicitParam(name = "prodName", value = "产品名称", dataType = "String", paramType = "query"),
    })
    @PostMapping("/getProdList")
    @ResponseBody
    public CommonResult<CommonPage<Prod>> listProds(Integer pageNum,
                                                    Integer pageSize,
                                                    String prodName) {
        //获取用户信息
        AdminUserDetails user = (AdminUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<Prod> prodPage = prodService.search(user.getUserUuid(), prodName, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(prodPage));
    }

    @ApiOperation("修改产品信息")
    @RequestMapping(value = "/updateProd", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateProd( @RequestBody Prod prod) {
        int count = prodService.updateProd(prod);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("新增产品信息")
    @RequestMapping(value = "/insertProd", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult insertProd( @RequestBody Prod prod) {
        AdminUserDetails user = (AdminUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        int count = prodService.insertProd(user.getQds(),prod);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }



}
