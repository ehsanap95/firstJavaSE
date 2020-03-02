package start;

import org.junit.Before;
import org.junit.Test;

public class UnitTest {

	@Before
	public void before() {
		System.out.println("We are ready to start testing");
	}

	@Test
	public void start() throws Exception {
		Starter starter = new Starter();
		starter.newMethod();
	}

}
