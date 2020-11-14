package com.baicells.camera.mapper;

import com.baicells.camera.Entity.Staff;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface WorkMapper extends BaseMapper<Staff> {

    public int insertLog(String staff);

}
