package com.itutry.spring5.demo2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.itutry.spring5.demo2")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {
}
