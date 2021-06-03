package com.ryx.service.impl;

import com.ryx.dto.AdminUserDetails;
import com.ryx.mapper.UserMapper;
import com.ryx.model.User;
import com.ryx.model.UserPermission;
import com.ryx.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserService实现类
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserPermission> getPermissionList(String userUuid) {
        return userMapper.getPermissionList(userUuid);
    }

    @Override
    public UserDetails loadUserByUsername(String userUuid) throws UsernameNotFoundException {
        return new AdminUserDetails(userMapper.selectByPrimaryKey(userUuid), getPermissionList(userUuid));
    }

    @Override
    public List<User> querySubordinateUsers(String qds, String phone, String xm, Integer pageSize, Integer pageNum) {
        return userMapper.querySubordinateUsers(qds, phone, xm);
    }

    @Override
    public int updateUser(User user) {
        if (user != null && !"".equals(user.getUserUuid())) {
            return userMapper.updateUser(user);
        } else {
            return 0;
        }
    }
}
