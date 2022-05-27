import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class numbereventest {
	int a ;
	Numbereven even = new Numbereven();
	@Before
	public void setUp() throws Exception {
		int a = 2;
	}
	@Test
	public void test() {
		String actual = even.numbereven(a);
		String expected = "This is an even number";
		assertSame(actual,expected);
	}
	@After
	public void tearDown() throws Exception {
	}
}
