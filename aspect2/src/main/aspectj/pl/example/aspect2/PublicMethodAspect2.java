package pl.example.aspect2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class PublicMethodAspect2 {
	
	@Around("execution(public * *(..)) && within(pl.example.impl..*)")
	public Object aroundPublicMethod(ProceedingJoinPoint point) throws Throwable {
		System.out.println("PublicMethodAspect2.aroundPublicMethod ProceedingJoinPoint: " + point);
		Object ret = point.proceed();
		System.out.println("PublicMethodAspect2.aroundPublicMethod ProceedingJoinPoint: " + point);
		return ret;
	}
}
