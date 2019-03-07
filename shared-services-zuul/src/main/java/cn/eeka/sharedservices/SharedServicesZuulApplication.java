package cn.eeka.sharedservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName: SharedServicesZuulApplication
 * @Description: TODO
 * @author: SimonWayne
 * @date: 2019/3/7 10:41
 */
@SpringBootApplication
@EnableZuulProxy
public class SharedServicesZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharedServicesZuulApplication.class, args);
    }
}
