package com.ryx.mapper;

import com.ryx.common.api.CommonResult;
import com.ryx.model.CodeTable;

import java.util.List;

public interface CommonMapper {
    List<CodeTable> getCodeTable(String dmType);
}
