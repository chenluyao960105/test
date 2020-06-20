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
@TableName("tab_function")
public class Function extends Model<Function> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "function_id", type = IdType.AUTO)
    private Integer functionId;
    @TableField("function_name")
    private String functionName;
    @TableField("father_id")
    private Integer fatherId;


    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    @Override
    protected Serializable pkVal() {
        return this.functionId;
    }

    @Override
    public String toString() {
        return "Function{" +
        "functionId=" + functionId +
        ", functionName=" + functionName +
        ", fatherId=" + fatherId +
        "}";
    }
}
