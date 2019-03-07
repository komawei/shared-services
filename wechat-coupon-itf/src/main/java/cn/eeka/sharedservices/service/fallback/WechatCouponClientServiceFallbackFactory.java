package cn.eeka.sharedservices.service.fallback;

import cn.eeka.sharedservices.service.WechatCouponClientService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName: WechatCouponClientServiceFallbackFactory
 * @Description: TODO
 * @author: SimonWayne
 * @date: 2019/3/6 17:25
 */
@Component
public class WechatCouponClientServiceFallbackFactory implements FallbackFactory<WechatCouponClientService> {

    @Override
    public WechatCouponClientService create(Throwable throwable) {
        return new WechatCouponClientService() {

            @Override
            public String listAllCoupons(String type) {
                return "fallback";
            }
        };
    }
}
