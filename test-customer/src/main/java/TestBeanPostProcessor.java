import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author renzhiyong
 */
public class TestBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("TestBeanPostProcessor postProcessBeforeInitialization " + bean);
		if (bean instanceof CircleA) {
			return new A();
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("TestBeanPostProcessor postProcessAfterInitialization " + bean);
		return bean;
	}
}
