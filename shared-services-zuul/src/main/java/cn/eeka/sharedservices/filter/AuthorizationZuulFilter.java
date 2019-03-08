package cn.eeka.sharedservices.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
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

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        String auth = "admin:123456";
        byte[] encodedAuth = Base64Utils.encode(auth.getBytes(StandardCharsets.US_ASCII));
        String authHeader = "Basic " + new String(encodedAuth);
        ctx.addZuulRequestHeader("Authorization", authHeader);

        return null;
    }
}
