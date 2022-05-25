package com.jiayi.goods.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jiayi.goods.bean.HotSailCategory;
import com.jiayi.goods.mapper.HotSailCategoryMapper;
import com.jiayi.goods.service.HotSailCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
/**
 * @author ytw
 * @date 2022/5/25 10:24
 */
@Service
public class HotSailCategoryServiceImpl implements HotSailCategoryService {

    @Autowired
    HotSailCategoryMapper hotSailCategoryMapper;

    /*
    * 筛选热门推荐类中上架的商品类别
    * */
    @Override
    public List<Map> queryHotSailCategory(String areCode) {
        QueryWrapper<HotSailCategory> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("upload", 1);
        List<HotSailCategory> list = hotSailCategoryMapper.selectList(queryWrapper);
        return queryHotSailCategoryByPid(list, "0");
    }

    /*
     * 递归查询上架商品类别的子类
     * */
    private List<Map> queryHotSailCategoryByPid(List<HotSailCategory> hotSailCategoryList, String pid) {
        List<Map> mapList = new ArrayList<Map>();
        for (HotSailCategory hotSailCategory : hotSailCategoryList) {
            if (hotSailCategory.getPid().equals(pid)) {
                Map map = new HashMap();
                map.put("CateCode", hotSailCategory.getCateCode());
                map.put("CateName", hotSailCategory.getCateName());
                map.put("Sort", hotSailCategory.getSort());
                map.put("Children", queryHotSailCategoryByPid(hotSailCategoryList, hotSailCategory.getId()));
                mapList.add(map);
            }
        }
        return mapList;
    }

    /*
     * 添加热门推荐类别
     * */
    @Override
    public int addHotSailCategory(HotSailCategory hotSailCategory) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id", hotSailCategory.getId());
        List<HotSailCategory> list = hotSailCategoryMapper.selectList(queryWrapper);
        if (list.size() != 0) {
            return 0;
        } else {
            return hotSailCategoryMapper.insert(hotSailCategory);
        }
    }

    /*
     * 修改热门推荐的类别数据
     * */
    @Override
    public int updateHotSailCategory(HotSailCategory hotSailCategory) {
        return hotSailCategoryMapper.updateHotSailCategory(hotSailCategory);
    }

    /*
     * 删除热门推荐类别
     * */
    @Override
    public int delHotSailCategory(String id) {
        return hotSailCategoryMapper.delHotSailCategory(id);
    }


}
