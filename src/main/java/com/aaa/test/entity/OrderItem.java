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
@TableName("order_item")
public class OrderItem extends Model<OrderItem> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "orderitem_id", type = IdType.AUTO)
    private Integer orderitemId;
    @TableField("order_id")
    private String orderId;
    @TableField("product_name")
    private String productName;
    @TableField("product_num")
    private String productNum;
    @TableField("product_price")
    private String productPrice;


    public Integer getOrderitemId() {
        return orderitemId;
    }

    public void setOrderitemId(Integer orderitemId) {
        this.orderitemId = orderitemId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    protected Serializable pkVal() {
        return this.orderitemId;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
        "orderitemId=" + orderitemId +
        ", orderId=" + orderId +
        ", productName=" + productName +
        ", productNum=" + productNum +
        ", productPrice=" + productPrice +
        "}";
    }
}
