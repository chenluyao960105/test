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
@TableName("function_role")
public class FunctionRole extends Model<FunctionRole> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "function_role_id", type = IdType.AUTO)
    private Integer functionRoleId;
    @TableField("role_id")
    private Integer roleId;
    @TableField("function_id")
    private Integer functionId;


    public Integer getFunctionRoleId() {
        return functionRoleId;
    }

    public void setFunctionRoleId(Integer functionRoleId) {
        this.functionRoleId = functionRoleId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    @Override
    protected Serializable pkVal() {
        return this.functionRoleId;
    }

    @Override
    public String toString() {
        return "FunctionRole{" +
        "functionRoleId=" + functionRoleId +
        ", roleId=" + roleId +
        ", functionId=" + functionId +
        "}";
    }
}
