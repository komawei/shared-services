package cn.eeka.sharedservices.wechat.entity;

import cn.eeka.sharedservices.common.entity.BaseEntity;
import com.dangdang.ddframe.rdb.sharding.keygen.DefaultKeyGenerator;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: WechatCoupon
 * @Description: TODO
 * @author: SimonWayne
 * @date: 2019/3/1 10:25
 */
public class WechatCoupon extends BaseEntity {

    private String id;

    private String couponCode;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":\"")
                .append(id).append('\"');
        sb.append(",\"couponCode\":\"")
                .append(couponCode).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
