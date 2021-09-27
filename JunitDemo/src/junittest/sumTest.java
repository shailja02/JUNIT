package junittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class sumTest {

	@Test
	public void test() {
		UnitTesting un=new UnitTesting();
		int result=un.sum(2,3);
		assertEquals(5,result);
	}

}
