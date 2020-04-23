package com.wzj.controller;

import com.wzj.mapper.C_AttachmentMapper;
import com.wzj.pojo.C_Attachment;

import com.wzj.uilts.IoInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.time.LocalDateTime;
import java.util.List;
@Component
@RestController
public class C_AttachmentController {

    @Autowired
    private C_AttachmentMapper c_attachmentMapper;
    @GetMapping("getList")
    public List<C_Attachment> getList(){
        List<C_Attachment> list = c_attachmentMapper.getList();
        for (C_Attachment c_attachment : list) {
            System.out.println(c_attachment);
        }return list;
    }

    @GetMapping("addList")
    public String addList(){
        LocalDateTime now=LocalDateTime.now();
        String file= IoInput.input();
        String name=IoInput.fileName();
        int i = c_attachmentMapper.addList(new C_Attachment(2,file,name,now));
        return "ok";
    }

}
