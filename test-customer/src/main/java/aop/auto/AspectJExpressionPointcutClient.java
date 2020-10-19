package aop.auto;

import org.springframework.aop.aspectj.AspectJExpressionPointcut;

/**
 * @author renzhiyong
 */
public class AspectJExpressionPointcutClient {
	public static void main(String[] args) throws NoSuchMethodException {
		AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
		aspectJExpressionPointcut.setExpression("execution(* aop.auto.MyTarget.execute*(..))");
		System.out.println(aspectJExpressionPointcut.matches(MyTarget.class));
		System.out.println(aspectJExpressionPointcut.matches(AspectJExpressionPointcutClient.class));
		System.out.println(aspectJExpressionPointcut.matches(MyTarget.class.getMethod("execute1", null),MyAspect.class));
		System.out.println(aspectJExpressionPointcut.matches(MyTarget.class.getMethod("execute2", null),MyAspect.class));
		System.out.println(aspectJExpressionPointcut.matches(MyTarget.class.getMethod("test", null),MyAspect.class));
	}
}
