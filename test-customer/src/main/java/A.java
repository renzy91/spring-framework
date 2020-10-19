import org.springframework.beans.factory.InitializingBean;

/**
 * @author renzhiyong
 */
public class A implements InitializingBean {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("A afterPropertiesSet");
	}
}
