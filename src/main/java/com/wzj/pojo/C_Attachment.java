package com.wzj.pojo;

import java.time.LocalDateTime;
import java.util.Arrays;



public class C_Attachment {
    private int id;
    private String file;
    private String name;
    private LocalDateTime time;

    @Override
    public String toString() {
        return "C_Attachment{" +
                "id=" + id +
                ", file='" + file + '\'' +
                ", name='" + name + '\'' +
                ", time=" + time +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public C_Attachment(int id, String file, String name, LocalDateTime time) {
        this.id = id;
        this.file = file;
        this.name = name;
        this.time = time;
    }

    public C_Attachment() {
    }
}
