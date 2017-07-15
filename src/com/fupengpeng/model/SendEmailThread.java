package com.fupengpeng.model;

public class SendEmailThread extends Thread{
	@Override
	public void run() {
		int i = 0;
		try {
			while (true) {
				//每休眠一分钟，就去扫表sendemailtable，看看那份信件应该发出
				Thread.sleep(10*1000);
				System.out.println("发送第"+(++i)+"封邮件");//javamail
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
