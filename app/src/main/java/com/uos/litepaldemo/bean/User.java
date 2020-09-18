package com.uos.litepaldemo.bean;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

/**
 * Create By xxc
 * Date: 2020/9/17 17:45
 * Desc:
 */
public class User extends LitePalSupport {

    /**
     * unique：是否唯一
     * nullable：是否可以为null
     * defaultValue：默认值
     * ignore：是否忽略
     * index：是否索引
     */
    private long id;
    private String username;
    private String gender;
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
