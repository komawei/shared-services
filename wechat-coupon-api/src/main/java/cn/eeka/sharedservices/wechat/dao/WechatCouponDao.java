package cn.eeka.sharedservices.wechat.dao;

import cn.eeka.sharedservices.wechat.entity.WechatCoupon;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;



/**
 * @ClassName: WechatCouponDao
 * @Description: TODO
 * @author: SimonWayne
 * @date: 2019/3/1 10:59
 */
@Mapper
public interface WechatCouponDao {

    List<WechatCoupon> listWithCondition(Map<String, Object> params);
}
