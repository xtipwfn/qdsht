package com.ryx.mapper;

import com.ryx.model.User;

import java.util.List;

import com.ryx.model.UserPermission;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * 根据用户UUID查询用户信息
     * @param userUuid
     * @return
     */
    User selectByPrimaryKey(String userUuid);

    /**
     * 根据手机号、密码、渠道商号查询用户信息
     * @param phone
     * @param password
     * @return
     */
    User queryUser(String phone, String password);

    /**
     * 根护用户UUID查询用户权限信息
     * @param userUuid
     * @return
     */
    List<UserPermission> getPermissionList(String userUuid);

    /**
     * 根所用户qds查询本下级用户信息（查询条件手机号、姓名可为空）
     * @param qds
     * @param phone
     * @param xm
     * @return
     */
    List<User> querySubordinateUsers(@Param("qds")String qds,@Param("phone") String phone, @Param("xm")String xm);

    int updateUser(User user);
}