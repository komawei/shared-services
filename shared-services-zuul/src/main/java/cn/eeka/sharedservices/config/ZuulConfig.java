package cn.eeka.sharedservices.config;

import cn.eeka.sharedservices.filter.AuthorizationZuulFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: ZuulConfig
 * @Description: TODO
 * @author: SimonWayne
 * @date: 2019/3/8 9:45
 */
@Configuration
public class ZuulConfig {

    @Bean
    public AuthorizationZuulFilter getAuthorizationZuulFilter() {
        return new AuthorizationZuulFilter();
    }
}
