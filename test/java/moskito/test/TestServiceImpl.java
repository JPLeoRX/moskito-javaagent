package moskito.test;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 08.04.13 17:24
 */
public class TestServiceImpl implements TestService {

	private String foo;
	private static String staticFoo;

	@Override
	public long echo(long ping) {
		return ping;
	}
}
