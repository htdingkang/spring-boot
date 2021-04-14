package com.atguigu.actuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;


/**
 * 自定义健康状态指示器
 * 1、编写一个指示器 实现 HealthIndicator 接口
 * 2、指示器的名字 xxxHealthIndicator  必须以HealthIndicator结尾
 * 3、加入容器中
 * 4 健康状态信息的key：xxx  本例中为 myApp
 */
@Component
public class MyAppHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {

        //自定义的检查方法
        //Health.up().build()代表健康
        return Health.down().withDetail("msg","服务异常").build();
    }
}
