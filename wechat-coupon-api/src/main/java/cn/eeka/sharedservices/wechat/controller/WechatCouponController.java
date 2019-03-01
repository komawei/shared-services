package cn.eeka.sharedservices.wechat.controller;

import cn.eeka.sharedservices.wechat.entity.WechatCoupon;
import cn.eeka.sharedservices.wechat.service.WechatCouponService;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

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

    @RequestMapping(value = "/listAllCoupons", method = RequestMethod.GET)
    public List<WechatCoupon> listAll() {
        Map<String, Object> params = Maps.newHashMap();
        return wechatCouponService.listWithCondition(params);
    }
}
