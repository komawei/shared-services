package cn.eeka.sharedservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: WechatCouponApiWithoutSecurityApplication
 * @Description: TODO
 * @author: SimonWayne
 * @date: 2019/3/7 10:53
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
public class WechatCouponApiWithoutSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(WechatCouponApiWithoutSecurityApplication.class, args);
    }
}
