package com.sojson.caiyg.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description 权限过滤
 * @author caiyg
 * 
 */
@WebServlet("/AuthorityFilter")
public class AuthorityFilter implements Filter  {
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("AuthorityFilter is destroyed !");
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)arg0;
		HttpServletResponse response = (HttpServletResponse)arg1;
		
		String requestUri = request.getRequestURI();
		StringBuffer requestURL = request.getRequestURL();
		System.out.println("requestUri ============= "+requestUri);
		System.out.println("requestURL ============= "+requestURL.toString());
		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("AuthorityFilter is initting !");
	}
       

}
