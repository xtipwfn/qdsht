package com.ryx.service.impl;

import com.ryx.mapper.OrderMapper;
import com.ryx.model.Order;
import com.ryx.service.OrderSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderSericeImpl implements OrderSerice {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<Order> queryOrders(String qds, Order order) {
        return orderMapper.queryOrders(qds, order);
    }
}
