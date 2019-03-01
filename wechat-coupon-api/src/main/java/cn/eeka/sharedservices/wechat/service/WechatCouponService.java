package cn.eeka.sharedservices.wechat.service;

import cn.eeka.sharedservices.wechat.dao.WechatCouponDao;
import cn.eeka.sharedservices.wechat.entity.WechatCoupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * @ClassName: WechatCouponService
 * @Description: TODO
 * @author: SimonWayne
 * @date: 2019/3/1 14:24
 */
@Service
public class WechatCouponService {

    @Autowired
    private WechatCouponDao wechatCouponDao;

    public List<WechatCoupon> listWithCondition(Map<String, Object> params) {
        return wechatCouponDao.listWithCondition(params);
    }
}
