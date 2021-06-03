package com.ryx.mapper;

import com.ryx.model.Menu;

import java.util.List;

public interface MenuMapper {
    List<Menu> queryMenu(String userUuid);
}
