package com.bobo.controller;

import com.sun.tools.internal.ws.processor.model.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResponseEntryController {
    @RequestMapping("/testResponseEntry")
    public ResponseEntity<String> testResponseEntry(){
        String body = "<h1>hello</h1>";
        MultiValueMap<String,String> header = new HttpHeaders();
        header.add("Set-Cookie","name=zhangsan");
        ResponseEntity<String> responseEntity=new ResponseEntity<String>(body,header, HttpStatus.OK);
        return responseEntity;
    }
}
