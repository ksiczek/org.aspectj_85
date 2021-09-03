package pl.example.aspect1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PublicMethodAspect1 {

	@Before("execution(public * *(..)) && within(pl.example.impl..*)")
	public void beforePublicMethod(JoinPoint joinPoint) {
		System.out.println("PublicMethodAspect1.beforePublicMethod JoinPoint: " + joinPoint);
	}
}
