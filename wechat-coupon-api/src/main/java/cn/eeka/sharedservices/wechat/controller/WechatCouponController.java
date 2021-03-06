package cn.eeka.sharedservices.wechat.controller;

import cn.eeka.sharedservices.wechat.service.WechatCouponService;
import com.google.common.collect.Maps;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.Objects;

/**
 * @ClassName: WechatCouponController
 * @Description: TODO
 * @author: SimonWayne
 * @date: 2019/3/1 14:25
 */
@RestController
public class WechatCouponController {

    @Autowired
    private WechatCouponService wechatCouponService;

    @HystrixCommand(fallbackMethod = "listAllFallback")
    @RequestMapping(value = "/listAllCoupons", method = RequestMethod.GET)
    public String listAll(String type) throws Exception {
        if (Objects.equals(type, "hystrix")) {
            throw new Exception("error");
        }

        Map<String, Object> params = Maps.newHashMap();
        return wechatCouponService.listWithCondition(params);
    }

    public String listAllFallback(String type) throws Exception {
        return "hystrix-activated" + type;
    }

    @RequestMapping(value = "/getSessionId")
    public String getSessionId(HttpSession session) {
        return session.getId();
    }
}
