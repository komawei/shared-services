package cn.eeka.sharedservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName: WechatCouponApplication
 * @Description: TODO
 * @author: SimonWayne
 * @date: 2019/3/4 17:14
 */
@EnableTransactionManagement
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class WechatCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(WechatCouponApplication.class, args);
    }

}