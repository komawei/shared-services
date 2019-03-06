package cn.eeka.sharedservices;

/**
 * @ClassName: WechatCouponConsumerApplication
 * @Description: TODO
 * @author: SimonWayne
 * @date: 2019/3/6 9:43
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: WechatCouponConsumerApplication
 * @Description: TODO
 * @author: SimonWayne
 * @date: 2019/3/4 17:17
 */
@SpringBootApplication
@EnableFeignClients(basePackages = {"cn.eeka.sharedservices.service"})
@EnableEurekaClient
public class WechatCouponConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WechatCouponConsumerApplication.class, args);
    }
}
