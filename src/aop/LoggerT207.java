package aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

/**
 * ��־����
 * ������ǰ�С�����
 * @author cuiyi
 *
 */
public class LoggerT207 {
	/**
	 * ǰ����ǿ
	 */
	public void before(JoinPoint jp){
		System.out.println("����"+jp.getTarget()+"��"
				+ ""+jp.getSignature().getName()+"������"
						+ "��������Ϊ:"+Arrays.toString(jp.getArgs()));
	}
	
	
	/**
	 * ������ǿ
	 * @param jp
	 * @param result  ����ֵ
	 */
	public void afterReturning(JoinPoint jp,Object result){
		System.out.println("����"+jp.getTarget()+"��"
				+ ""+jp.getSignature().getName()+"������"
						+ "��������ֵ:"+result);
	}
}
