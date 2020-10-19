import org.springframework.beans.factory.FactoryBean;

/**
 * @author renzhiyong
 */
public class ABeanFactory implements FactoryBean<A> {
	@Override
	public A getObject() throws Exception {
		A a = new A();
		a.setName("factory A");
		return a;
	}

	@Override
	public Class<?> getObjectType() {
		return A.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
