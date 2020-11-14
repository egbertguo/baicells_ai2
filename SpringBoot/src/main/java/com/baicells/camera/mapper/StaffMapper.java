package com.baicells.camera.mapper;

import com.baicells.camera.Entity.Staff;
import com.baicells.camera.dto.StaffInfoDTO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StaffMapper extends BaseMapper<Staff> {
    List<Staff> findStaffByName(String name);

    public List<Staff> ListStaff();

    public int insertStaff(Staff staff);

    public int deleteStaffByID(String staffId);

    public int Update(Staff staff);
}
