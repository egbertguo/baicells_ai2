package com.baicells.camera.serviceImpl;

import com.baicells.camera.Entity.Staff;
import com.baicells.camera.base.ResponseCodeEnum;
import com.baicells.camera.base.RtnResult;
import com.baicells.camera.dto.StaffInfoDTO;
import com.baicells.camera.mapper.StaffMapper;
import com.baicells.camera.service.StaffService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StaffServiceImpl extends ServiceImpl<StaffMapper, Staff> implements StaffService {

    @Autowired
    StaffMapper staffMapper;

    @Override
    public RtnResult CreateStaff(StaffInfoDTO dto) {
        Staff staff = new Staff();
        staff.setStaffId(dto.getStaffId());
        staff.setStaffName(dto.getStaffName());
        staff.setStaffPhoto(dto.getStaffPhoto());

        int staffInsert = staffMapper.insertStaff(staff);
        if (staffInsert == 1) {
            return new RtnResult(ResponseCodeEnum.SUCCESS.getCode(), ResponseCodeEnum.SUCCESS.getMessage());
        }
        return new RtnResult(ResponseCodeEnum.FAIL.getCode(), ResponseCodeEnum.FAIL.getMessage());
    }

    @Override
    public RtnResult ListStaff() {
        List<Staff> staff = staffMapper.ListStaff();
        if(staff.isEmpty()){
            return new RtnResult(ResponseCodeEnum.FAIL.getCode(), ResponseCodeEnum.FAIL.getMessage());
        }
        return new RtnResult(ResponseCodeEnum.SUCCESS.getCode(), ResponseCodeEnum.SUCCESS.getMessage(), staff);
    }

    @Override
    public RtnResult DeleteStaff(StaffInfoDTO dto) {
        int result = staffMapper.deleteStaffByID(dto.getStaffId());
        if (result == 1) {
            return new RtnResult(ResponseCodeEnum.SUCCESS.getCode(), ResponseCodeEnum.SUCCESS.getMessage());
        }
        return new RtnResult(ResponseCodeEnum.FAIL.getCode(), ResponseCodeEnum.FAIL.getMessage());
    }
}
