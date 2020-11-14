package com.baicells.camera.controller;


import com.baicells.camera.base.ResponseCodeEnum;
import com.baicells.camera.base.RtnResult;
import com.baicells.camera.dto.StaffInfoDTO;
import com.baicells.camera.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/camera/")
public class CameraController {

    //将Service注入Web层
    @Autowired
    StaffService staffService;

    @PostMapping("createStaff")
    public RtnResult createStaff(@RequestBody StaffInfoDTO dto) {
        if (null == dto.getStaffName() || null == dto.getStaffId() || null == dto.getStaffPhoto())
            return new RtnResult(ResponseCodeEnum.PARAM_IS_ERROR.getCode(), ResponseCodeEnum.PARAM_IS_ERROR.getMessage());
        //return RtnResult.ok("123");
        return staffService.CreateStaff(dto);
    }

    @PostMapping("listStaff")
    public RtnResult listStaff() {
        return staffService.ListStaff();
    }

    @PostMapping("deleteStaff")
    public RtnResult deleteStaff(@RequestBody StaffInfoDTO dto) {
        return staffService.DeleteStaff(dto);
    }
}
