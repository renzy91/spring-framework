package aop.aop1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author renzhiyong
 */
public class AOPTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		TestBean testBean = context.getBean(TestBean.class);
		testBean.print();
	}
}
