package com.wzj.uilts;

import org.springframework.stereotype.Component;

import java.io.*;
public class Copy {
    public void copy(InputStream srcPath,String destPath){
        File ing=new File(destPath);
        InputStream is =srcPath;
        FileInputStream fis=(FileInputStream)is;

        try {
            OutputStream os=new BufferedOutputStream(new FileOutputStream(ing));
            byte[] flush=new byte[1024];
            while ((fis.read(flush))!=-1){
                    os.write(flush);
            }
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
