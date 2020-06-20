package com.aaa.test.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
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
@TableName("user_role")
public class UserRole extends Model<UserRole> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_role_id", type = IdType.AUTO)
    private Integer userRoleId;
    @TableField("user_id")
    private Integer userId;
    @TableField("role_id")
    private Integer roleId;


    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    protected Serializable pkVal() {
        return this.userRoleId;
    }

    @Override
    public String toString() {
        return "UserRole{" +
        "userRoleId=" + userRoleId +
        ", userId=" + userId +
        ", roleId=" + roleId +
        "}";
    }
}
