package com.ryx.model;

/**
 *菜单
 */
public class Menu {
    String menuUuid;
    String menuName;
    String url;
    String img;
    String sjMenuUuid;

    public String getMenuUuid() {
        return menuUuid;
    }

    public void setMenuUuid(String menuUuid) {
        this.menuUuid = menuUuid;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSjMenuUuid() {
        return sjMenuUuid;
    }

    public void setSjMenuUuid(String sjMenuUuid) {
        this.sjMenuUuid = sjMenuUuid;
    }
}
