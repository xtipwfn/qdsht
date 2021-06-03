package com.ryx.controller;

import com.ryx.common.api.CommonResult;
import com.ryx.dto.AdminUserDetails;
import com.ryx.model.Menu;
import com.ryx.model.Order;
import com.ryx.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Api(tags = "MenuController", value = "菜单权限管理")
@Controller
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    MenuService menuService;

    @ApiOperation("查询贷款申请信息")
    @RequestMapping(value = "/queryMenu", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult queryMenu() {
        AdminUserDetails user = (AdminUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<Menu> menus = menuService.queryMenu(user.getUserUuid());
        if (menus != null && menus.size() > 0) {
            return CommonResult.success(menus);
        } else {
            return CommonResult.failed("无记录！");
        }
    }
}
