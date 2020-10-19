package aop.auto;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author renzhiyong
 */
@Aspect
public class MyAspect {
	@Pointcut("execution(* aop.auto.MyTarget.execute*(..))")
	public void exec(){}

	@Around("exec()")
	public Object around(ProceedingJoinPoint joinpoint) throws Throwable {
		System.out.println("MyAspect");
		return joinpoint.proceed();
	}
}
