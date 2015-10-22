package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Project: springbootstarter
 * FileName: Application
 * Date: 2015-10-23
 * Time: 오전 2:01
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Spring Boot Started!.");
    }

}
