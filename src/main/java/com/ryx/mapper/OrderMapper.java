package com.ryx.mapper;

import com.ryx.model.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    List<Order> queryOrders(@Param("qds") String qds, @Param("order") Order order);
}
