package aopZhuJie;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * ��־����
 * ������ǰ�С�����
 * @author cuiyi
 *
 */
//@Aspect
public class LoggerT207 {
	@Pointcut("execution(* service..*.*(..))")
	public void p(){}
	
	
	/**
	 * ǰ����ǿ
	 */
	@Before("p()")
	public void before(JoinPoint jp){
		System.out.println("---__---����"+jp.getTarget()+"��"
				+ ""+jp.getSignature().getName()+"������"
						+ "��������Ϊ:"+Arrays.toString(jp.getArgs()));
	}
	
	
	/**
	 * ������ǿ
	 * @param jp
	 * @param result  ����ֵ
	 */
	@AfterReturning(pointcut="p()",returning="result")
	public void afterReturning(JoinPoint jp,Object result){
		System.out.println("---__---����"+jp.getTarget()+"��"
				+ ""+jp.getSignature().getName()+"������"
						+ "��������ֵ:"+result);
	}
}
