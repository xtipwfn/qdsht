package com.ryx.controller;

import com.ryx.common.api.CommonResult;
import com.ryx.model.CodeTable;
import com.ryx.service.CommonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 公共方法管理
 */
@Api(tags = "CommonController", description = "公共方法管理")
@Controller
@RequestMapping("/common")
public class CommonController {
    @Autowired
    CommonService commonService;
    @ApiOperation("获取代码表")
    @RequestMapping(value = "/getCodeTable", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getCodeTable(@RequestParam String dmType) {
        List<CodeTable> codeTables = commonService.getCodeTable(dmType);
        if(codeTables != null && codeTables.size()>0){
            return CommonResult.success(codeTables);
        } else {
            return CommonResult.failed("无记录！");
        }
    }

}
