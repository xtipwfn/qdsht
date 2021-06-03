package com.ryx.service;

import com.ryx.common.api.CommonResult;
import com.ryx.model.Order;

import java.util.List;

public interface OrderSerice {
    List<Order> queryOrders(String qds, Order order);
}
