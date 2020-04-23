package com.wzj.mapper;

import com.wzj.pojo.C_Attachment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface C_AttachmentMapper {
    List<C_Attachment> getList();

     int addList(C_Attachment c_attachment);
}

