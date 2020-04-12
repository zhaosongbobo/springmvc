package com.bobo.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.IOException;

@Controller
public class DownLoadController {
    @RequestMapping("down")
    public ResponseEntity<byte[]> downLoad(HttpServletRequest servletRequest) throws IOException {
        //获取要下载文件的路径以及输入流
        ServletContext servletContext = servletRequest.getServletContext();
        String filePath=servletContext.getRealPath("/scripts/jquery-1.9.1.min.js");
        FileInputStream fileInputStream=new FileInputStream(filePath);
        byte[] bytes=new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        fileInputStream.close();
        //将要下载文件内容返回
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Content-Disposition","attachment;filename=jquery-1.9.1.min.js");
        return  new ResponseEntity<byte[]>(bytes,httpHeaders, HttpStatus.OK);
    }
}
