package com.wzj.uilts;

import org.springframework.web.multipart.MultipartFile;

import java.io.*;

public class IoInput {

    public static String input(InputStream srcPath){
            String str = null;
            //创建源

            //选择流

            InputStream is =srcPath;
            FileInputStream fis=(FileInputStream)is;
            try {

                byte[] flush=new byte[1024*1024*1024];
                int len=-1;
                while ((len=fis.read(flush))!=-1){
                    str=new String(flush,0,len);

                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    is.close();
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        return str;


    }

//    public static String fileName(){
//        String name=null;
//        File src =new File("src/main/resources/a.txt");
//        name=src.getName();
//        return name;
//
//    }
}
