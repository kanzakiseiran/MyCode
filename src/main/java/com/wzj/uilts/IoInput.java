package com.wzj.uilts;

import java.io.*;

public class IoInput {

    public static String input(){
            String str = null;
            //创建源
        File src =new File("src/main/resources/a.txt");
            //选择流

            InputStream is =null;

            try {
                is=new FileInputStream(src);
                byte[] flush=new byte[1024*1024*1024];
                int len=-1;
                while ((len=is.read(flush))!=-1){
                    str=new String(flush,0,len);

                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        return str;


    }

    public static String fileName(){
        String name=null;
        File src =new File("src/main/resources/a.txt");
        name=src.getName();
        return name;

    }
}
