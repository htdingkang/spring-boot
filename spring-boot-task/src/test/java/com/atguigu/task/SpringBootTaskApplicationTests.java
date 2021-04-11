package com.atguigu.task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.internet.MimeMessage;
import java.io.File;


/**
 * 邮件发送的流程   通过 账号 密码（授权码）登录到发送者服务器 发送邮件到接收者服务器
 * 发送者邮箱设置，需要开启POP3/SMTP服务
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTaskApplicationTests {


    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    public void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        //邮件设置
        message.setSubject("通知-今晚开会");
        message.setText("今晚7:30开会");

        message.setTo("ht_dingkang@126.com");
        //
        message.setFrom("1123983122@qq.com");

        mailSender.send(message);
    }

    @Test
    public void test02() throws Exception {
        //1、创建一个复杂的消息邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        //邮件设置
        helper.setSubject("通知-今晚开会");
        helper.setText("<b style='color:red'>今天 7:30 开会</b>", true);

        helper.setTo("ht_dingkang@126.com");
        helper.setFrom("1123983122@qq.com");

        //上传文件
        helper.addAttachment("1.jpg", new File("C:\\Users\\Administrator\\Desktop\\3.jpg"));
        helper.addAttachment("2.jpg", new File("C:\\Users\\Administrator\\Desktop\\3.jpg"));

        mailSender.send(mimeMessage);

    }
}
