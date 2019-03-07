package cn.eeka.sharedservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ClassName: WechatCouponConsumerHystrixDashboardApplication
 * @Description: TODO
 * @author: SimonWayne
 * @date: 2019/3/7 9:37
 */
@SpringBootApplication
@EnableHystrixDashboard
public class WechatCouponConsumerHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(WechatCouponConsumerHystrixDashboardApplication.class, args);
    }
}
