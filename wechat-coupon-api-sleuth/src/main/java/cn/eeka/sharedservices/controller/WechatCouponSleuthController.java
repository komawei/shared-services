package cn.eeka.sharedservices.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: WechatCouponSleuthController
 * @Description: TODO
 * @author: SimonWayne
 * @date: 2019/3/8 16:51
 */
@RestController
public class WechatCouponSleuthController {

    private static Logger logger = LoggerFactory.getLogger(WechatCouponSleuthController.class);

    @RequestMapping(value = "/testSleuth")
    public String testSleuth() {
        logger.info("testSleuth");
        return "testSleuth";
    }
}
