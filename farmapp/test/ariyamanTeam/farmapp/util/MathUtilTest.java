package ariyamanTeam.farmapp.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathUtilTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	@Test
	public void  testAdd() {
		MathUtil mathUtil = new MathUtil();
		assertEquals(mathUtil.add(5, 5), 10);
	}
}

