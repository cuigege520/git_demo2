package aopZhuJie;

import java.util.Arrays;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * ע��ʵ��  ������ǿ
 * @author cuiyi
 *
 */
@Aspect
public class AroundT207 {
	@Around("execution(* service..*.*(..))")
	public Object aroundAop(ProceedingJoinPoint jp){
		System.out.println("_-_����"+jp.getTarget()+"��"
				+ ""+jp.getSignature().getName()+"������"
						+ "��������Ϊ:"+Arrays.toString(jp.getArgs()));
		
		try {
			Object result = jp.proceed();  //����Ŀ�귽��
			System.out.println("-------->����ֵ�ǣ�"+result);
			
		} catch (Throwable e) {
			e.printStackTrace();
		} finally{
			System.out.println(jp.getSignature().getName()+"������ִ�н�����");
		}
		
		
		return null;
	}
}
