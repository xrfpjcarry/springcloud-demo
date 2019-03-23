package com.panjiao.shop.dto;

import java.io.Serializable;

/**
 * Created by xp
 * on 2019/3/8.
 */

public class UserDto implements Serializable{
    private String name;
    private String passWord;
    private int status;
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
