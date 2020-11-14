package com.baicells.camera.service;

import com.baicells.camera.base.RtnResult;
import com.baicells.camera.dto.StaffInfoDTO;

public interface WorkService {

    RtnResult clockin(StaffInfoDTO dto);

}
