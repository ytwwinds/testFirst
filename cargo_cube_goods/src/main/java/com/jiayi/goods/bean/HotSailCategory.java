package com.jiayi.goods.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author ytw
 * @date 2022/5/25 10:25
 */

@Data
@TableName("biz_hot_sail_category")
@ApiModel(value = "表对象", description = "热门商品类别")
public class HotSailCategory implements Serializable {
    /*
     *ID
     * */
    @ApiModelProperty(value = "ID")
    @NotBlank(message = "id不能为空")
    private String id;
    /*
     *父ID
     * */
    @ApiModelProperty(value = "父ID")
    @NotBlank(message = "父ID不能为空")
    private String pid;
    /*
     *地区代码
     * */
    @ApiModelProperty(value = "地区代码")
    @NotBlank(message = "地区代码不能为空")
    private String areaCode;
    /*
     *分类代码
     * */
    @ApiModelProperty(value = "分类代码")
    @NotBlank(message = "分类代码不能为空")
    private String cateCode;
    /*
     *分类名称
     * */
    @ApiModelProperty(value = "分类名称")
    @NotBlank(message = "分类名称不能为空")
    private String cateName;
    /*
     *排序
     * */
    @ApiModelProperty(value = "排序")
    private Integer sort;
    /*
     *是否可挂钩
     * */
    @ApiModelProperty(value = "是否可挂钩")
    private Integer connectable;
    /*
     *是否上架
     * */
    @ApiModelProperty(value = "是否上架")
    private Integer upload;
    /*
     *创建时间
     * */
    @ApiModelProperty(value = "创建时间")
    private String createTime;
    /*
     *修改时间
     * */
    @ApiModelProperty(value = "修改时间")
    private String updateTime;
    /*
     *是否删除
     * */
    @ApiModelProperty(value = "是否删除")
    private Integer del;
}
