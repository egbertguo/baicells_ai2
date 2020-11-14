package com.baicells.camera.service;

import com.baicells.camera.base.RtnResult;
import com.baicells.camera.dto.StaffInfoDTO;

public interface StaffService {

    RtnResult CreateStaff(StaffInfoDTO dto);
    RtnResult ListStaff();
    RtnResult DeleteStaff(StaffInfoDTO dto);

}
