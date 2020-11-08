package com.baicells.camera.serviceImpl;

import com.baicells.camera.Entity.Staff;
import com.baicells.camera.base.ResponseCodeEnum;
import com.baicells.camera.base.RtnResult;
import com.baicells.camera.dto.StaffInfoDTO;
import com.baicells.camera.mapper.StaffMapper;
import com.baicells.camera.service.StaffService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StaffServiceImpl extends ServiceImpl<StaffMapper, Staff> implements StaffService {

    StaffMapper staffMapper;

    @Override
    public RtnResult CreateStaff(StaffInfoDTO dto) {
        Staff staff = new Staff();
        staff.setStaffId(dto.getStaffId());
        staff.setStaffName(dto.getStaffName());
        staff.setStaffPhoto(dto.getStaffPhoto());

        int staffInsert = staffMapper.insert(staff);
        if (staffInsert == 1) {
            return new RtnResult(ResponseCodeEnum.SUCCESS.getCode(), ResponseCodeEnum.SUCCESS.getMessage());
        }
        return new RtnResult(ResponseCodeEnum.FAIL.getCode(), ResponseCodeEnum.FAIL.getMessage());
    }
}
