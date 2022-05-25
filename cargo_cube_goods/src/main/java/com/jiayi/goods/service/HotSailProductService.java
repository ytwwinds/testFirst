package com.jiayi.goods.service;

import com.jiayi.goods.bean.Goods;
import com.jiayi.goods.bean.HotSailProduct;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author ytw
 * @date 2022/5/25 10:25
 */
@Service
public interface HotSailProductService {

    List<Goods> queryHotSailProduct(String cateId);

    int addHotSailProduct(HotSailProduct hotSailProduct);

    int updateHotSailProduct(HotSailProduct hotSailProduct);

    int delHotSailProduct(String cateId);
}
