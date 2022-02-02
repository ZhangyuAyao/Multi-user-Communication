package com.hspedu.qqcommon;

import java.io.Serializable;

/**
 * @author Zhang Yu
 * @version 1.0
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1l;
    private String userId;//用户Id/用户名
    private String passwd;//用户密码


    public User(){}

    public User(String userId, String passwd) {
        this.userId = userId;
        this.passwd = passwd;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getUserId() {
        return userId;
    }

    public String getPasswd() {
        return passwd;
    }
}
