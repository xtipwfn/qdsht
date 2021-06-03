package com.ryx.service;

import com.ryx.common.api.CommonResult;
import com.ryx.model.User;

public interface LoginService {
    /**
     * 通过手机号和密码查询有效的用户信息
     */
    User queryUserByPhoneAndPwd(String phone, String password);

    /**
     * 登陆
     * @param phone
     * @param password
     * @return
     */
    String login(String phone, String password);

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
