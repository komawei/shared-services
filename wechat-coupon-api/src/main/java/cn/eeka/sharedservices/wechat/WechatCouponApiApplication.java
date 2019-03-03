package cn.eeka.sharedservices.wechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class WechatCouponApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WechatCouponApiApplication.class, args);
	}

}
