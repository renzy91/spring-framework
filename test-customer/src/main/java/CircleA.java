import org.springframework.beans.factory.InitializingBean;

/**
 * @author renzhiyong
 */
public class CircleA implements InitializingBean {
	private String name;
	private CircleB circleB;

	public void setCircleB(CircleB circleB) {
		this.circleB = circleB;
	}

	@Override
	public void afterPropertiesSet() throws Exception {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
