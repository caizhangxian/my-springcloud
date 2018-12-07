package com.mine.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;


/**
 * @Description
 * @Company: 北京国文互联教育科技集团有限公司
 * @Author:caizhangxian
 * @Date: 10:14 2018/12/7
 */
@Component
public class IpAddressFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
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
        String ip = ctx.getRequest().getRemoteAddr();

         System.out.println("*******************************************"+ip);
        return null;
    }
}
