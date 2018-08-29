package aop;

import org.aspectj.lang.JoinPoint;

public class ErrorT207 {
	public void afterThrowing(JoinPoint jp,RuntimeException e){
		System.out.println(jp.getSignature().getName()+"方法，-_-发生异常:"+e);
	}
}
