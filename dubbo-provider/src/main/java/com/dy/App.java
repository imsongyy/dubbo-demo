package com.dy;

import com.alibaba.dubbo.config.ApplicationConfig;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});

        context.start();
        System.out.println("服务启动成功！");
        System.in.read();

        ApplicationConfig config = new ApplicationConfig();


    }
}
