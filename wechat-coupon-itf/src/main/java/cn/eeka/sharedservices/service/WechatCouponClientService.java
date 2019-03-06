package cn.eeka.sharedservices.service;

import cn.eeka.sharedservices.config.FeignClientConfig;
import cn.eeka.sharedservices.service.fallback.WechatCouponClientServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: WechatCouponClientService
 * @Description: TODO
 * @author: SimonWayne
 * @date: 2019/3/6 14:07
 */
@FeignClient(configuration = FeignClientConfig.class, value = "SHARED-SERVICES-WECHAT-COUPON-API", fallbackFactory = WechatCouponClientServiceFallbackFactory.class)
public interface WechatCouponClientService {

    @RequestMapping(value = "/listAllCoupons", method = RequestMethod.GET)
    String listAllCoupons(@RequestParam("type") String type);
}
