package aop.auto;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * @author renzhiyong
 */
public class ProxyFactoryClient {
	public static void main(String[] args) {
		AspectJProxyFactory proxyFactory = new AspectJProxyFactory();
		proxyFactory.setProxyTargetClass(true);
		// 必须先设置Target后设置Aspect
		proxyFactory.setTarget(new MyTarget());
		proxyFactory.addAspect(MyAspect.class);

		MyTarget target = proxyFactory.getProxy();
		target.execute1();
		target.execute2();
	}
}
