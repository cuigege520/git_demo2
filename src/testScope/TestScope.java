package testScope;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {
	@Test
	public void t1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("testScope\\applicationContext.xml");
	
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		Date s1 = (Date)ac.getBean("singleton1");
		Date p1 = (Date)ac.getBean("prototype1");
		
		System.out.println("s1 date 1 = "+df.format(s1));
		System.out.println("p1 date 1 = "+df.format(p1));
		
		System.out.println("µÈ´ý5Ãë..........................");
		try{
			Thread.sleep(5000);   //ÑÓ³Ù5Ãë
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		Date s2 = (Date)ac.getBean("singleton1");
		Date p2 = (Date)ac.getBean("prototype1");
		
		System.out.println("s2 date 2 = "+df.format(s2));
		System.out.println("p2 date 2 = "+df.format(p2));

	}
}
