package com.jiayi.goods.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author ytw
 * @date 2022/5/25 10:26
 */

@Data
@TableName("biz_hot_sail_product_conn")
public class HotSailProduct implements Serializable {
    /*
     * 分类id
     * */
    private String cateId;
    /*
     *热门商品
     * */
    private String productId;
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
