package com.email;

public class MnoEmail implements IEmail{
	
	private String smtpServer;
	MnoEmail(String smtpServer){
		this.smtpServer = smtpServer;
		System.out.println("SMTP:"+smtpServer);
	}
	
	public void sendMail()
	{
		System.out.println("sending the mail.......");
	}
	
	public void recvMail()
	{
		System.out.println("receving the email....");
	}
}
