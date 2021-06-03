package com.ryx.service.impl;

import com.ryx.common.api.CommonResult;
import com.ryx.mapper.CommonMapper;
import com.ryx.model.CodeTable;
import com.ryx.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonServiceImpl implements CommonService {
    @Autowired
    private CommonMapper commonMapper;
    @Override
    public List<CodeTable> getCodeTable(String dmType) {
        return commonMapper.getCodeTable(dmType);
    }
}
