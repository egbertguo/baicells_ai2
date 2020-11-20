package com.baicells.camera.controller;


import com.baicells.camera.base.ResponseCodeEnum;
import com.baicells.camera.base.RtnResult;
import com.baicells.camera.dto.StaffInfoDTO;
import com.baicells.camera.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

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

    @GetMapping("test")
    public String hello() {
        return "hello world";
    }

    private final String UPLOAD_DIR = "/usr/local/apache2/htdoc/";
    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) {

        // check if file is empty
        if (file.isEmpty()) {
            return "file is empty!";
        }

        // normalize the file path
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        // save the file on the local file system
        try {
            Path path = Paths.get(UPLOAD_DIR + fileName);
            Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "http://112.95.135.75:8002" + UPLOAD_DIR + fileName;
    }
}
