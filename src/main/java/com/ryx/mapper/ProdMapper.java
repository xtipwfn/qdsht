package com.ryx.mapper;

import com.ryx.model.Prod;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProdMapper {

    List<Prod> queryProdListByProdName(@Param("userUuid") String userUuid, @Param("prodName") String prodName);

    int updateProd(Prod prod);

    int insertProd(@Param("qds") String qds, @Param("prod") Prod prod);
}