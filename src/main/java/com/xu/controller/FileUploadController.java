package com.xu.controller;

import com.xu.pojo.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class FileUploadController {

    @PostMapping("/upload")
    public Result<String> upload(MultipartFile file) throws IOException {
        //把文件的内容存储到本地磁盘
        String originalFilename = file.getOriginalFilename();
        //保证文件的名字是唯一的，从而防止文件被覆盖
        String filename= UUID.randomUUID().toString()+originalFilename.substring(originalFilename.lastIndexOf("."));
        file.transferTo(new File("D:\\Learn\\big-news\\src\\main\\resources\\com\\xu\\images\\"+filename));

        return Result.success("url访问地址。。。");
    }
}
