package com.gysoft;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 魏文思
 * @date 2019/8/26$ 19:13$
 */
@ConfigurationProperties(prefix = "wws")
public class HelloProperties {
    private   static  final  String DEFAULT_NAME="大境筑";
    private  static  final  String  DEFAULT_MSG="Java天下第一";
    private String name = DEFAULT_NAME;
    private String msg = DEFAULT_MSG;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

}
