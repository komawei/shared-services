package cn.eeka.sharedservices.wechat;

import cn.eeka.sharedservices.wechat.controller.WechatCouponController;
import cn.eeka.sharedservices.wechat.entity.WechatCoupon;
import cn.eeka.sharedservices.wechat.service.WechatCouponService;
import com.google.common.collect.Maps;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WechatCouponApiApplicationTests {

    @Autowired
    private WechatCouponController wechatCouponController;

	@Test
	public void contextLoads() {
        System.out.println(wechatCouponController.listAll());
	}

}
