package com.panjiao.shop.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by xp
 * on 2019/3/13.
 */
public class Md5Util {
    private static final String saolt[]=
            {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
    public static String  Md5Ecoding(String userName,String passWord){
        String s = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            s=Md5PassWord(md5.digest((userName + passWord).getBytes()));
            return s;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return s;
    }
    public static String Md5PassWord (byte[] bytes){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0;i<bytes.length;i++){
            stringBuffer.append(bytesTostring(bytes[i]));
        }
        return stringBuffer.toString();
    }

    public static String bytesTostring(byte b){
        int n =b;
        if (n<0){
            n+=256;
        }
        int d1= n/16;
        int d2 =n%16;
        return saolt[d1]+saolt[d2];
    }
}
