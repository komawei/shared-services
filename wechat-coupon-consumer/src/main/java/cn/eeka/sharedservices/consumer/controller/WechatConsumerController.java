package cn.eeka.sharedservices.consumer.controller;

import cn.eeka.sharedservices.service.WechatCouponClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: WechatConsumerController
 * @Description: TODO
 * @author: SimonWayne
 * @date: 2019/3/6 9:45
 */
@RestController
public class WechatConsumerController {

    @Autowired
    private WechatCouponClientService wechatCouponClientService;

    @RequestMapping(value = "/feignTest")
    public String feignTest(String type) {
        return wechatCouponClientService.listAllCoupons(type);
    }
}
