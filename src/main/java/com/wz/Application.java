package com.wz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 第一个Springboot应用
 * 在Plugins下spring-boot里执行 spring-boot:run 即可
 * Create by wangzi on 2017/8/5
 */
@SpringBootApplication
public class Application {
    public static void main( String[] args ) {
        System.out.println( "Hello SpringBoot!" );
        SpringApplication.run(Application.class, args);
        synchronized (Application.class){
            while (true){
                try {
                    Application.class.wait();
                }catch (Throwable t){
                }
            }
        }
    }
}
