package cn.eeka.sharedservices.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.util.Base64Utils;

import java.nio.charset.StandardCharsets;

/**
 * @ClassName: AuthoriazationZuulFilter
 * @Description: TODO
 * @author: SimonWayne
 * @date: 2019/3/8 9:27
 */
public class AuthorizationZuulFilter extends ZuulFilter {

    private Logger logger = LoggerFactory.getLogger(AuthorizationZuulFilter.class);

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER + 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        logger.info("Zuul filter runs");
        RequestContext ctx = RequestContext.getCurrentContext();
        String auth = "admin:123456";
        String encodedAuth = Base64Utils.encodeToString(auth.getBytes());
        String authHeader = "Basic " + encodedAuth;
        logger.info("authHeader->" + authHeader);
        ctx.addZuulRequestHeader("Authorization", authHeader);

        return null;
    }
}
