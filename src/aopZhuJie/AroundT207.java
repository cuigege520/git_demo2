package aopZhuJie;

import java.util.Arrays;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * 注解实现  环绕增强
 * @author cuiyi
 *
 */
@Aspect
public class AroundT207 {
	@Around("execution(* service..*.*(..))")
	public Object aroundAop(ProceedingJoinPoint jp){
		System.out.println("_-_调用"+jp.getTarget()+"的"
				+ ""+jp.getSignature().getName()+"方法。"
						+ "方法参数为:"+Arrays.toString(jp.getArgs()));
		
		try {
			Object result = jp.proceed();  //调用目标方法
			System.out.println("-------->返回值是："+result);
			
		} catch (Throwable e) {
			e.printStackTrace();
		} finally{
			System.out.println(jp.getSignature().getName()+"方法，执行结束！");
		}
		
		
		return null;
	}
}
