package print;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	@Test
	public void t2(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("print//print.xml");
		Print pp = (Print)ac.getBean("print");
		pp.p();
	}
	
	@Test
	public void t1(){
		Print print = new Print();
		print.p();
	}
}
