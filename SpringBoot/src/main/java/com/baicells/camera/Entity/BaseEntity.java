package com.baicells.camera.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @author jincheng
 * @version 1.0
 * @date 2020/3/8 3:08 上午
 */

@Data
public class BaseEntity {
    //这是实体类继承类,里面放公用的表id,创建时间,更新时间

    private static final long serialVersionUID = 1L;

    /**
     * 表id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
