package cn.eeka.sharedservices.wechat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WechatCouponApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WechatCouponApiApplication.class, args);
	}

}
