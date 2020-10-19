package aop.aop2;

/**
 * @author renzhiyong
 */
public class Target implements ITarget {
	@Override
	public void excute() {
		System.out.println("Target ...");
	}
}
