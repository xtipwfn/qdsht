package com.ryx.service.impl;

import com.ryx.mapper.MenuMapper;
import com.ryx.model.Menu;
import com.ryx.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;
    @Override
    public List<Menu> queryMenu(String userUuid) {
        return menuMapper.queryMenu(userUuid);
    }
}
