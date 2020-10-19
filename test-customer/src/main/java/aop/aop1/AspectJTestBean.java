package aop.aop1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author renzhiyong
 */
@Aspect
public class AspectJTestBean {

	@Pointcut("execution(* *.print())")
	public void print(){}

	@Before("print()")
	public void beforePrint() {
		System.out.println("beforePrint");
	}

	@After("print()")
	public void afterPrint() {
		System.out.println("afterPrint");
	}

	@Around("print()")
	public void around(ProceedingJoinPoint point) {
		System.out.println("before around");
		try {
			point.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("after around");

	}
}

