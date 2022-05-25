package com.jiayi.goods.controller;

import com.jiayi.goods.bean.HotSailCategory;
import com.jiayi.goods.bean.Result;
import com.jiayi.goods.service.HotSailCategoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
/**
 * @author ytw
 * @date 2022/5/25 10:21
 */
@RestController
@RequestMapping("/goods")
public class HotSailCategoryController {
    @Autowired
    private HotSailCategoryService hotSailCategoryService;

    @PostMapping("/queryHotSailCategory")
    @ApiOperation(value = "查询热门商品分类")
    public Result<?> queryHotSailCategory(String areaCode) {
        return Result.success(this.hotSailCategoryService.queryHotSailCategory(areaCode));
    }

    @PostMapping("/addaddHotSailCategory")
    @ApiOperation(value = "添加热门商品分类")
    public Result<?> addaddHotSailCategory(@Valid @RequestBody HotSailCategory hotSailCategory){
        int i=this.hotSailCategoryService.addHotSailCategory(hotSailCategory);
        if(i==0){
            return Result.fail(500,"分类id重复");
        }
        return Result.success("添加成功！");
    }

    @PostMapping("/updateHotSailCategory")
    @ApiOperation(value = "修改热门商品的分类")
    public Result<?> updateHotSailCategory(@Valid @RequestBody HotSailCategory hotSailCategory){
        if(hotSailCategory == null){
            Result.fail(500,"修改失败！");
        }
        hotSailCategoryService.updateHotSailCategory(hotSailCategory);
        return Result.success("修改成功！");
    }

    @PostMapping("/delHotSailCategory")
    @ApiOperation(value = "删除热门商品的分类")
    public Result<?> delHotSailCategory(String id){
        hotSailCategoryService.delHotSailCategory(id);
        return Result.success("删除成功！");
    }
}
