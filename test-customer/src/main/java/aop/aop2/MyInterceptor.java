package aop.aop2;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author renzhiyong
 */
public class MyInterceptor implements MethodInterceptor {


	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		try {
			System.out.println("MyInterceptor start");
			return invocation.proceed();
		} finally {
			System.out.println("MyInterceptor end");
		}
	}
}
