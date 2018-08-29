package test;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import action.HelloSpring;
import entity.User;
import service.UserService;

public class Test1 {
	
	@Test
	public void t3s(){
		//spring方式
		//默认读取resource文件下的applicationContext.xml
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		UserService abc = (UserService)ac.getBean("userService");//获取对象
		abc.query();
	}
	
	@Test
	public void t5(){
		//spring方式
		//默认读取resource文件下的applicationContext.xml
		ApplicationContext ac = new ClassPathXmlApplicationContext("aopZhuJie\\applicationContext-aopZhuJie.xml");
		
		UserService abc = (UserService)ac.getBean("userService");//获取对象
		abc.saveUser("李思", "123");
	}
	
	@Test
	public void t4(){
		//spring方式
		//默认读取resource文件下的applicationContext.xml
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-p.xml");
		
		User user = (User)ac.getBean("user");
		
		Set set = user.getHobbues1();
		
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	

	
	
	@Test
	public void t2(){
		//spring方式
		//默认读取resource文件下的applicationContext.xml
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		HelloSpring abc = (HelloSpring)ac.getBean("helloSpring");//获取对象
		abc.print();
	}
	
	@Test
	public void t1(){
		//传统方式
		HelloSpring helloSpring = new HelloSpring();
		helloSpring.setWho("T207");
		helloSpring.print();
	}
	
}
