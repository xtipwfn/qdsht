package com.ryx.controller;

import com.ryx.common.api.CommonResult;
import com.ryx.dto.AdminUserDetails;
import com.ryx.model.Order;
import com.ryx.service.OrderSerice;
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

/**
 * 贷款申请
 */
@Api(tags = "OrderController", value = "贷款申请管理")
@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderSerice orderSerice;

    @ApiOperation("查询贷款申请信息")
    @RequestMapping(value = "/queryOrders", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult queryOrders(@RequestBody Order order) {
        AdminUserDetails user = (AdminUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<Order> orders = orderSerice.queryOrders(user.getQds(), order);
        if (orders != null && orders.size() > 0) {
            return CommonResult.success(orders);
        } else {
            return CommonResult.failed("无记录！");
        }
    }

}
