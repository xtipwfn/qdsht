package com.ryx.dto;

import com.ryx.model.User;
import com.ryx.model.UserPermission;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SpringSecurity需要的用户详情
 */
public class AdminUserDetails implements UserDetails {
    private User user;
    private List<UserPermission> permissionList;

    public AdminUserDetails(User umsAdmin, List<UserPermission> permissionList) {
        this.user = umsAdmin;
        this.permissionList = permissionList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限
        return permissionList.stream()
                .filter(permission -> permission.getMenuUuid() != null)
                .map(permission -> new SimpleGrantedAuthority(permission.getMenuUuid()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return user.getPwd();
    }

    //username不唯一，用户UUID代替用户名
    @Override
    public String getUsername() {
        return user.getUserUuid();
    }

    public String getPhone() {
        return user.getPhone();
    }

    public String getUserUuid() {
        return user.getUserUuid();
    }

    public String getQds() {
        return user.getQds();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

}
