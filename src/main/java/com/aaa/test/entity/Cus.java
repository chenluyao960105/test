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
@TableName("tab_cus")
public class Cus extends Model<Cus> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cus_id", type = IdType.AUTO)
    private Integer cusId;
    @TableField("cus_name")
    private String cusName;


    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    @Override
    protected Serializable pkVal() {
        return this.cusId;
    }

    @Override
    public String toString() {
        return "Cus{" +
        "cusId=" + cusId +
        ", cusName=" + cusName +
        "}";
    }
}
