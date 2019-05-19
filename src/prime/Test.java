package prime;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import junit.framework.TestCase;

class Test extends TestCase{
	protected void test1to10Prime(){
		int[] p = {2,3,5,7};
		int[] tp = new Prime(1,10).getArray();
		assertTrue(Arrays.equals(p, tp));
	}
	
	@org.junit.jupiter.api.Test
	void test() {
		fail("Not yet implemented");
	}
	// assertArrayEquals(int[] expected, int[] actual; String message);
	// assertNotNull(Object actual; String message);
	// assertNotSame(Object unexpected, Object actual);
	// assertNull(Object actual; String message);
	// assertThrows(Class<T> expectedType, Executable executable; String message);
	// assertTimeout(Duration timeout, Executable executable, String message);
	// assertFalse/True(boolean condition, String message);
	// fail(String message and/or Throwable cause);
	// 
}
