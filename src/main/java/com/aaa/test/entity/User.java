package com.aaa.test.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author AAATeacherChen
 * @since 2020-06-19
 */
@TableName("tab_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;
    private String username;
    private String password;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

    @Override
    public String toString() {
        return "User{" +
        "userId=" + userId +
        ", username=" + username +
        ", password=" + password +
        "}";
    }
}
