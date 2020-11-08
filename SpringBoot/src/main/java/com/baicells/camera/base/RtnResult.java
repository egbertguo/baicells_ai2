package com.baicells.camera.base;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * @author jincheng
 * @version 1.0
 * @date 2020/3/5 10:51 下午
 */

@Data
@NoArgsConstructor
public class RtnResult implements Serializable{

    private int code; // 状态码
    private String message;// 错误消息
    private Object data;// 返回对象


    public RtnResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public RtnResult(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public RtnResult(Object data) {
        this.code = 0;
        this.message = "OK";
        this.data = data;
    }

    public static com.baicells.camera.base.RtnResult ok(Object data) {
        return new com.baicells.camera.base.RtnResult(data);
    }

    public static com.baicells.camera.base.RtnResult ok() {
        return new com.baicells.camera.base.RtnResult(null);
    }

    public static com.baicells.camera.base.RtnResult error(BaseCodeEnum baseCodeEnum) {
        return new com.baicells.camera.base.RtnResult(baseCodeEnum.getCode(),baseCodeEnum.getMessage());
    }

}