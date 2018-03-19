package com.fengchaoxhao.springboot.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.fengchaoxhao.springboot.dubbo.HelloApi;

@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class HelloProvider implements HelloApi {
    public String sayHello(String name) {
        return "Hi, "+name+" !";
    }
}
