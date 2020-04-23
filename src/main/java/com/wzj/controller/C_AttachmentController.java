package com.wzj.controller;

import com.wzj.mapper.C_AttachmentMapper;
import com.wzj.pojo.C_Attachment;
import com.wzj.uilts.IoInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/file")
public class C_AttachmentController {

    @Autowired
    private C_AttachmentMapper c_attachmentMapper;
    @GetMapping("/getList")
    public List<C_Attachment> getList(){
        List<C_Attachment> list = c_attachmentMapper.getList();
        for (C_Attachment c_attachment : list) {
            System.out.println(c_attachment);
        }return list;
    }

    @PostMapping(value = "/upload")
    public String addList(@RequestParam("file") MultipartFile file) throws IOException {
        LocalDateTime now=LocalDateTime.now();
        InputStream in=file.getInputStream();
        String fe=IoInput.input(in);
        String name=file.getOriginalFilename();
        int i = c_attachmentMapper.addList(new C_Attachment(2,fe,name,now));
        return "file";
    }
    @RequestMapping("/hello")
    public String hello(Model m){
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";  //视图重定向hello.jsp
    }


}
