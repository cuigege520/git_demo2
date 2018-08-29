package aopZhuJie;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 日志切面
 * 包括：前切、后切
 * @author cuiyi
 *
 */
//@Aspect
public class LoggerT207 {
	@Pointcut("execution(* service..*.*(..))")
	public void p(){}
	
	
	/**
	 * 前置增强
	 */
	@Before("p()")
	public void before(JoinPoint jp){
		System.out.println("---__---调用"+jp.getTarget()+"的"
				+ ""+jp.getSignature().getName()+"方法。"
						+ "方法参数为:"+Arrays.toString(jp.getArgs()));
	}
	
	
	/**
	 * 后置增强
	 * @param jp
	 * @param result  返回值
	 */
	@AfterReturning(pointcut="p()",returning="result")
	public void afterReturning(JoinPoint jp,Object result){
		System.out.println("---__---调用"+jp.getTarget()+"的"
				+ ""+jp.getSignature().getName()+"方法。"
						+ "方法返回值:"+result);
	}
}
