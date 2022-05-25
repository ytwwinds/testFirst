package com.jiayi.goods.controller;

import com.jiayi.goods.bean.HotSailProduct;
import com.jiayi.goods.bean.Result;
import com.jiayi.goods.service.HotSailProductService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
/**
 * @author ytw
 * @date 2022/5/25 10:24
 */

@RestController
@RequestMapping("/goods")
public class HotSailProductController {
    @Autowired
    private HotSailProductService hotSailProductService;

    @PostMapping("/queryHotSailProduct")
    @ApiOperation(value = "查询热门商品分类对应的商品")
    public Result<?> queryHotSailProduct(String cateId) {
        return Result.success(this.hotSailProductService.queryHotSailProduct(cateId));
    }

    @PostMapping("/addHotSailProduct")
    @ApiOperation(value = "添加热门商品分类对应的商品")
    public Result<?>addHotSailProduct(@Valid @RequestBody HotSailProduct hotSailProduct){
        int i=this.hotSailProductService.addHotSailProduct(hotSailProduct);
        if(i==0){
            return Result.fail(500,"cateId重复");
        }
        return Result.success("添加成功！");
    }

    @PostMapping("/updateHotSailProduct")
    @ApiOperation(value = "修改热门商品分类对应的商品")
    public Result<?>updateHotSailProduct(@Valid @RequestBody HotSailProduct hotSailProduct){
        if(hotSailProduct == null){
            return Result.fail(500,"修改失败！");
        }
        this.hotSailProductService.updateHotSailProduct(hotSailProduct);
        return Result.success("修改成功！");
    }

    @PostMapping("/delHotSailProduct")
    @ApiOperation(value = "删除热门商品分类对应的商品")
    public Result<?>delHotSailProduct(String cateId){
        this.hotSailProductService.delHotSailProduct(cateId);
        return Result.success("删除成功！");
    }
}
