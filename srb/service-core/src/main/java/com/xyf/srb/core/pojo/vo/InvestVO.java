package com.xyf.srb.core.pojo.vo;
/*
@author XYF
@date 2021/5/23- 17:22     
*/

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(description = "投标信息")
public class InvestVO {

    private Long lendId;

    //投标金额
    private String investAmount;

    //用户id
    private Long investUserId;

    //用户姓名
    private String investName;
}