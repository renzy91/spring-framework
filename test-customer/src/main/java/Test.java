import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

/**
 * @author renzhiyong
 */
public class Test {

	public static void main(String[] args) {
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("/a.xml"));
//		xmlBeanFactory.addBeanPostProcessor(new TestBeanPostProcessor());
//		xmlBeanFactory.ignoreDependencyType(CircleB.class);
//		Object a = xmlBeanFactory.getBean("a");
//		Object a1 = xmlBeanFactory.getBean("a");
//
//		Object aa = xmlBeanFactory.getBean("aa");
//		Object aa1 = xmlBeanFactory.getBean("aa");
//		Object aa2 = xmlBeanFactory.getBean("&aa");
//		Object aa3 = xmlBeanFactory.getBean("&aa");
//		BeanDefinition staticADef = xmlBeanFactory.getBeanDefinition("staticA");
//		xmlBeanFactory.setAllowCircularReferences(true);
//		Object circleA = xmlBeanFactory.getBean("circleA");
//		System.out.println();
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("a.xml");
		Object circleA = applicationContext.getBean("circleA");
		System.out.println();
	}

}
