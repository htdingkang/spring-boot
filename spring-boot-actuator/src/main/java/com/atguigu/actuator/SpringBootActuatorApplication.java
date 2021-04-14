package com.atguigu.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 监控和管理端点
 * autoconfig       所有自动配置信息
 * auditevents      审计事件
 * beans            所有bean的信息
 * configprops      所有配置属性
 * dump             线程状态信息
 * env              当前环境信息
 * health           应用健康状况
 * info             当前应用信息
 * metrics          应用的各项指标
 * mappings         应用@ResquestMapping路径映射
 * shutdown         关闭当前应用（默认关闭）
 * trace            追踪信息（最新的http请求）
 */
@SpringBootApplication
public class SpringBootActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootActuatorApplication.class, args);
    }

}
