package com.study.muti.sources.serializabletest;

import org.apache.commons.io.FileUtils;
import org.springframework.util.Base64Utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/12/21.
 */
public class StringByteMain {
    public static void main(String args[]) throws IOException {
        File file = new File("d:/abd.jpg");
        byte[] bytes = FileUtils.readFileToByteArray(file);
        String base64string = Base64Utils.encodeToString(bytes);
        System.out.println(base64string);
    }
}
