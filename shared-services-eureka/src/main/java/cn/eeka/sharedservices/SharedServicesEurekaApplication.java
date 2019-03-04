package cn.eeka.sharedservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: SharedServicesEurekaApplication
 * @Description: TODO
 * @author: SimonWayne
 * @date: 2019/3/4 17:17
 */
@SpringBootApplication
@EnableEurekaServer
public class SharedServicesEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharedServicesEurekaApplication.class, args);
    }
}
