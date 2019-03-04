package cn.eeka.sharedservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName: WechatCouponApplication
 * @Description: TODO
 * @author: SimonWayne
 * @date: 2019/3/4 17:14
 */
@EnableTransactionManagement
@SpringBootApplication
public class WechatCouponApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WechatCouponApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WechatCouponApplication.class);
    }
}