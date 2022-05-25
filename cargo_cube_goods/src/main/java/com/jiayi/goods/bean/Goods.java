package com.jiayi.goods.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ytw
 * @date 2022/5/25 10:26
 */
@Data
/*
* 需要返回的商品信息
* */
public class Goods implements Serializable {

    /*
    * 商品id
    * */
    private String id;
    /*
     *厂家名称
     * */
    private String factoryName;
    /*
     *商品名称
     * */
    private String productName;
    /*
     *单位
     * */
    private String unit;
    /*
     *封面图片url
     * */
    private String image;
    /*
     *备注
     * */
    private String remark;
    /*
     *封面参考价格
     * */
    private String refPrice;
}
