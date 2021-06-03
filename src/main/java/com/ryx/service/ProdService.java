package com.ryx.service;

import com.github.pagehelper.PageInfo;
import com.ryx.model.Prod;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProdService {
    //查询产品信息
    public List<Prod> search(String userUuid, String prodName, Integer pageSize, Integer pageNum);

    int updateProd(Prod prod);

    int insertProd(String qds, Prod prod);
}
