package com.email;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DummyEmail implements IEmail{
	MnoEmail obj;
	public DummyEmail()
	{
        Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        obj=(MnoEmail)factory.getBean("mail", "abc.xyz.com"); 
	}
	public void sendMail()
	{
		obj.sendMail();
	}
	
	public void recvMail()
	{
		obj.recvMail();
	}
}
