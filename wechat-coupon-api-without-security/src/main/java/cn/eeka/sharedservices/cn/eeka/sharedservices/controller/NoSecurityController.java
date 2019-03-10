package cn.eeka.sharedservices.cn.eeka.sharedservices.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: NoSecurityController
 * @Description: TODO
 * @author: SimonWayne
 * @date: 2019/3/7 10:54
 */
@RestController
public class NoSecurityController {

    @RequestMapping(value = "/listCouponWithoutSecurity")
    public String listCouponWithoutSecurity() {
        return "listCouponWithoutSecurity";
    }
}
