package com.ryx.service;

import com.ryx.common.api.CommonResult;
import com.ryx.model.CodeTable;

import java.util.List;

public interface CommonService {
    List<CodeTable> getCodeTable(String dmType);
}
