package com.pettravel.zuul;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class SimpleFilter extends ZuulFilter {

	@Override
	public Object run() throws ZuulException {
		RequestContext rc = RequestContext.getCurrentContext();
		HttpServletRequest req = rc.getRequest();
		System.out.println(req.getContextPath());
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

}
