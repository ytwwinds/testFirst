package com.jiayi.goods.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jiayi.goods.bean.HotSailCategory;
import org.apache.ibatis.annotations.Mapper;
/**
 * @author ytw
 * @date 2022/5/25 10:24
 */

@Mapper
public interface HotSailCategoryMapper extends BaseMapper<HotSailCategory> {

    int updateHotSailCategory(HotSailCategory hotSailCategory);

    int delHotSailCategory(String id);

}
