package com.acheng.core;

import com.acheng.core.config.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloProperties.class)
@ConditionalOnClass(HelloService.class)
public class HelloAutoConfiguration {

    @Autowired
    HelloProperties helloProperties;

    @Bean
    HelloService helloService() {
        HelloService helloService = new HelloService();
        helloService.setMsg(helloProperties.getMsg());
        helloService.setName(helloProperties.getName());
        return helloService;
    }
}
