package com.baicells.camera.vo;

import lombok.Data;

import java.util.Date;

@Data
public class staffVO {
    //用户id
    private String staffId;

    //用户姓名
    private String staffName;

    //照片
    private String staffPhoto;

    //时间
    private Date create_time;
}
