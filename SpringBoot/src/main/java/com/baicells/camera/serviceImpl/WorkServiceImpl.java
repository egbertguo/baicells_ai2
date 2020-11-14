package com.baicells.camera.serviceImpl;

import com.baicells.camera.Entity.Staff;
import com.baicells.camera.base.ResponseCodeEnum;
import com.baicells.camera.base.RtnResult;
import com.baicells.camera.dto.StaffInfoDTO;
import com.baicells.camera.mapper.StaffMapper;
import com.baicells.camera.mapper.WorkMapper;
import com.baicells.camera.service.StaffService;
import com.baicells.camera.service.WorkService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WorkServiceImpl extends ServiceImpl<WorkMapper, Staff> implements WorkService {
    @Autowired
    WorkMapper workMapper;

    @Override
    public RtnResult clockin(StaffInfoDTO dto) {
        int staffInsert = workMapper.insertLog(dto.getStaffId());
        if (staffInsert == 1) {
            return new RtnResult(ResponseCodeEnum.SUCCESS.getCode(), ResponseCodeEnum.SUCCESS.getMessage());
        }
        return new RtnResult(ResponseCodeEnum.FAIL.getCode(), ResponseCodeEnum.FAIL.getMessage());
    }
}
