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
@TableName("tab_product")
public class Product extends Model<Product> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "product_id", type = IdType.AUTO)
    private Integer productId;
    @TableField("product_name")
    private String productName;
    @TableField("product_price")
    private String productPrice;
    @TableField("product_info")
    private String productInfo;
    @TableField("product_type")
    private String productType;


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    protected Serializable pkVal() {
        return this.productId;
    }

    @Override
    public String toString() {
        return "Product{" +
        "productId=" + productId +
        ", productName=" + productName +
        ", productPrice=" + productPrice +
        ", productInfo=" + productInfo +
        ", productType=" + productType +
        "}";
    }
}
