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
 * �̰߳�ȫ����
 * Servlet implementation class MyServlet1
 */
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int ticket = 2;
    int i = 0;  //��Ա����������MyServlet1����
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

		int j = 0;  //�ֲ�����������doGet����
		j++;
		i++;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
//		out.println("hello"+ new Date().toString()+"   ticket="+ticket);
		out.println("hello"+ new Date().toString()+"   j="+j);
		out.println("hello"+ new Date().toString()+"   i="+i);
//		//�߳�ͬ��������
//		synchronized(this){
//			if(ticket > 0){
//				System.out.println("���Ѿ���Ʊ��");
//				//����
//				try {
//					Thread.sleep(10*1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				ticket--;
//				
//			}else {
//				System.out.println("��û����Ʊ");
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
