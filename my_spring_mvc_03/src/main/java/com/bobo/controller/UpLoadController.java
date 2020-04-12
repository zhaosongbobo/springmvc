package com.bobo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class UpLoadController {
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String testUpload(@RequestParam(value = "desc",required = false) String desc, @RequestParam("file")MultipartFile[] multipartFile) throws IOException {
        System.out.println("desc : " + desc);
        for (MultipartFile file : multipartFile) {
            if (!file.isEmpty()) {
                System.out.println("OriginalFilename : " + file.getOriginalFilename());
                file.transferTo(new File("D:\\file\\" + file.getOriginalFilename()));
            }
        }
        return "success";
    }
}
