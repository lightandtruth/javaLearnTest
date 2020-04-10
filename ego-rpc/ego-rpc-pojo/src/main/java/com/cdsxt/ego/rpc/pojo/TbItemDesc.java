package com.cdsxt.ego.rpc.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class TbItemDesc implements Serializable {
    /**
    * 商品ID
    */
    private Long itemId;

    /**
    * 商品描述
    */
    private String itemDesc;

    /**
    * 创建时间
    */
    private Date created;

    /**
    * 更新时间
    */
    private Date updated;

    private static final long serialVersionUID = 1L;
}