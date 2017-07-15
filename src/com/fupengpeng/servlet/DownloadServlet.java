package com.fupengpeng.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadServlet
 */
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
//		PrintWriter out = response.getWriter();
		//下载文件示例：1.打开文件（读取文件），2.发送文件给浏览器
		//说明有文件下载
		response.setHeader("Content-Disposition", "attachment;filename=nvshengtouxiang.png");
		//获取文件全路径
		String path = this.getServletContext().getRealPath("/image/nvshengtouxiang.png");
		System.out.println("path:"+path);
		//打开文件:创建文件输入流
//		FileInputStream f = new FileInputStream(path);
		FileInputStream fis = new FileInputStream(this.getServletContext().getRealPath("/image/nvshengtouxiang.png"));
		//缓存文件字节数组
		byte [] buff = new byte[1024];
		int len = 0;  //标识每次读取了多少字节
		OutputStream os = response.getOutputStream();
		while((len = fis.read()) > 0){
			os.write(buff, 0, len);  //
		}
		
		os.close();
		fis.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
