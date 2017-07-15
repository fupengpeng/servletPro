package com.fupengpeng.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * 线程安全问题
 * Servlet implementation class MyServlet1
 */
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int ticket = 2;
    int i = 0;  //成员变量，属于MyServlet1对象。
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int j = 0;  //局部变量，属于doGet方法
		j++;
		i++;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
//		out.println("hello"+ new Date().toString()+"   ticket="+ticket);
		out.println("hello"+ new Date().toString()+"   j="+j);
		out.println("hello"+ new Date().toString()+"   i="+i);
//		//线程同步问题解决
//		synchronized(this){
//			if(ticket > 0){
//				System.out.println("你已经买到票了");
//				//休眠
//				try {
//					Thread.sleep(10*1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				ticket--;
//				
//			}else {
//				System.out.println("你没有买到票");
//			}
//		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
