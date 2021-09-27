package junittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		UnitTesting un=new UnitTesting();
		int result=un.square(2);
		assertEquals(4,result);
	}

}
