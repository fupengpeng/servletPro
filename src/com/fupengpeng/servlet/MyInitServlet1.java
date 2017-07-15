package com.fupengpeng.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fupengpeng.model.SendEmailThread;

/**
 * 
 * Servlet implementation class MyInitServlet1
 */
public class MyInitServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	@Override
	public void init() throws ServletException {
		System.out.println("MyInitServlet1 的 init方法被调用。。。");
		//完成一些初始化任務
		System.out.println("創建數據庫，表，讀取參數");
		SendEmailThread sendEmailThread = new SendEmailThread();
//		sendEmailThread.start();
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyInitServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
