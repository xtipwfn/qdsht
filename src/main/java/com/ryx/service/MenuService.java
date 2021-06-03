package com.ryx.service;

import com.ryx.model.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> queryMenu(String userUuid);
}
