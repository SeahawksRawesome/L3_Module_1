package IntroToJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstTest {

	@Test
	public void test() {
	assertEquals(7, add(3, 4));
	}
	public int add(int x, int y) {
		int q = x + y;
		return q;
	}
	

}
