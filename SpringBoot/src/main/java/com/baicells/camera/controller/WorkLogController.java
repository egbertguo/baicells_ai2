package com.baicells.camera.controller;


import com.baicells.camera.base.ResponseCodeEnum;
import com.baicells.camera.base.RtnResult;
import com.baicells.camera.dto.StaffInfoDTO;
import com.baicells.camera.service.StaffService;
import com.baicells.camera.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/work/")
public class WorkLogController {

    //将Service注入Web层
    @Autowired
    WorkService workService;

    @PostMapping("clockin")
    public RtnResult clockin(@RequestBody StaffInfoDTO dto) {
        if (null == dto.getStaffId())
            return new RtnResult(ResponseCodeEnum.PARAM_IS_ERROR.getCode(), ResponseCodeEnum.PARAM_IS_ERROR.getMessage());
        return workService.clockin(dto);
    }

}
