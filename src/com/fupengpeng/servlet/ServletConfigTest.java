package com.fupengpeng.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 使用Servlet
 * Servlet implementation class ServletConfigTest
 */
public class ServletConfigTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	/**
	 * 获取servletConfig对象
	 */
    @Override
	public ServletConfig getServletConfig() {
		
		return super.getServletConfig();
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding(this.getServletConfig().getInitParameter("encoding"));
		System.out.println("编码是--"+this.getServletConfig().getInitParameter("encoding"));
		PrintWriter out = response.getWriter();
		
		Enumeration<String> names = this.getServletConfig().getInitParameterNames();		
		while(names.hasMoreElements()){
			String name = names.nextElement();
			System.out.println(name);
			System.out.println(this.getServletConfig().getInitParameter(name));
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
