package com.jiayi.goods.service;

import com.jiayi.goods.bean.HotSailCategory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author ytw
 * @date 2022/5/25 10:25
 */

@Service
public interface HotSailCategoryService {

   List<Map> queryHotSailCategory (String areCode);

   int addHotSailCategory(HotSailCategory hotSailCategory);

   int updateHotSailCategory(HotSailCategory hotSailCategory);

   int delHotSailCategory(String id);
}
