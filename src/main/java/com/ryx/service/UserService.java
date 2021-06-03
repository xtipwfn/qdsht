package com.ryx.service;

import com.ryx.model.User;
import com.ryx.model.UserPermission;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

/**
 * 后台管理员Service
 * Created by macro on 2018/4/26.
 */
public interface UserService extends UserDetailsService {
    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<UserPermission> getPermissionList(String userUuid);

    @Override
    default UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }

    List<User> querySubordinateUsers(String qds, String phone, String xm, Integer pageSize, Integer pageNum);

    int updateUser(User user);
}
