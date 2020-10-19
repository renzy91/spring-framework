package aop.auto;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author renzhiyong
 */
public class AutoProxyCreatorClient {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop.auto/auto-proxy-creator.xml");
		MyTarget target = (MyTarget) context.getBean("target");
		target.execute1();
		target.execute2();
	}
}
