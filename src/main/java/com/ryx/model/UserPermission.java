package com.ryx.model;


import java.io.Serializable;

public class UserPermission implements Serializable {

    private static final long serialVersionUID = 1L;
    private String userUuid;
    private String menuUuid;
    private String menuName;
    private String url;
    private String img;
    private String sjMenuUuid;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

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