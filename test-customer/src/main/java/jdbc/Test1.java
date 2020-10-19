package jdbc;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author renzhiyong
 */
public class Test1 {
	public static void main(String[] args) {
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("jdbc/test1-spring.xml"));
		Object dataSource = beanFactory.getBean("dataSource");
		JdbcTemplate bean = beanFactory.getBean(JdbcTemplate.class);
		System.out.println();
	}
}
