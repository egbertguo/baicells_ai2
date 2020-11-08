package com.baicells.camera.Entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
public class Staff extends BaseEntity {
    private String staffId;
    private String staffName;
    private String staffPhoto;
}
