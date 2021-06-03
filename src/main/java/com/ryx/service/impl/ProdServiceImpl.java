package com.ryx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ryx.mapper.ProdMapper;
import com.ryx.model.Prod;
import com.ryx.service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdServiceImpl implements ProdService {
    @Autowired
    private ProdMapper prodMapper;

    @Override
    public List<Prod> search(String userUuid, String prodName, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return prodMapper.queryProdListByProdName(userUuid, prodName);
    }

    @Override
    public int updateProd(Prod prod) {
        return prodMapper.updateProd(prod);
    }
    @Override
    public int insertProd(String qds ,Prod prod) {
        return prodMapper.insertProd(qds , prod);
    }
}
