package aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

/**
 * 日志切面
 * 包括：前切、后切
 * @author cuiyi
 *
 */
public class LoggerT207 {
	/**
	 * 前置增强
	 */
	public void before(JoinPoint jp){
		System.out.println("调用"+jp.getTarget()+"的"
				+ ""+jp.getSignature().getName()+"方法。"
						+ "方法参数为:"+Arrays.toString(jp.getArgs()));
	}
	
	
	/**
	 * 后置增强
	 * @param jp
	 * @param result  返回值
	 */
	public void afterReturning(JoinPoint jp,Object result){
		System.out.println("调用"+jp.getTarget()+"的"
				+ ""+jp.getSignature().getName()+"方法。"
						+ "方法返回值:"+result);
	}
}
