package aop;

import org.aspectj.lang.JoinPoint;

public class ErrorT207 {
	public void afterThrowing(JoinPoint jp,RuntimeException e){
		System.out.println(jp.getSignature().getName()+"������-_-�����쳣:"+e);
	}
}
