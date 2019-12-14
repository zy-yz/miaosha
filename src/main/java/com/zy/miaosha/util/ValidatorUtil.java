package com.zy.miaosha.util;

import org.thymeleaf.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorUtil {
    private static final Pattern mobile_pattren = Pattern.compile("1\\d{10}");

    public static boolean isMobile(String src){
        if(StringUtils.isEmpty(src)){
            return false;
        }
        Matcher m = mobile_pattren.matcher(src);
        return m.matches();
    }

    public static void main(String[] args) {
        System.out.println(isMobile("1222222222"));
    }
}
