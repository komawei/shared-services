package cn.eeka.sharedservices.wechat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@MapperScan("cn.eeka.sharedservices.wechat.dao")
public class WechatCouponApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WechatCouponApiApplication.class, args);
	}

}
