package aop.aop2;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

/**
 * @author renzhiyong
 */
public class Client {
	public static void main(String[] args) {
		ProxyFactory factory = new ProxyFactory(new Target());
		factory.setProxyTargetClass(true);
		NameMatchMethodPointcutAdvisor advisor = new NameMatchMethodPointcutAdvisor();
		advisor.setMappedName("excute");
		advisor.setAdvice(new MyInterceptor());
		factory.addAdvisor(advisor);
		ITarget proxy = (ITarget)factory.getProxy();
		proxy.excute();
	}
}
