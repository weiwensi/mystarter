package com.gysoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 魏文思
 * @date 2019/8/26$ 19:21$
 */

@Configuration //表明这是一个配置类
@EnableConfigurationProperties(HelloProperties.class)//注解是使我们之前配置的 @ConfigurationProperties 生效，让配置的属性成功的进入 Bean 中
@ConditionalOnClass(HelloService.class)//表示当项目当前 classpath 下存在 HelloService 时，后面的配置才生效。
public class HelloServiceAutoConfiguration {

    @Autowired
    HelloProperties helloProperties;
    @Bean
    HelloService helloService() {
        HelloService helloService = new HelloService();
        helloService.setName(helloProperties.getName());
        helloService.setMsg(helloProperties.getMsg());
        return helloService;
    }
}
