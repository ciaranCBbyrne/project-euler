package problem17;

import static org.junit.Assert.*;

import org.junit.Test;

public class alternate17Test {

	@Test
	public void testNumberInput() {
		alternate17 alter = new alternate17();
		assertTrue(alter.Add(1000).equals(1000));
	}
	
	@Test
	public void testSingle(){
		alternate17 alter = new alternate17();
		assertTrue(alter.Singles(1).equals(3));
		alter.number = 0;
		assertTrue(alter.Switch(1).equals(3));
	}
	
	@Test
	public void testTeen(){
		alternate17 alter = new alternate17();
		assertTrue(alter.Teens(13).equals(8));
		alter.number = 0;
		assertTrue(alter.Switch(13).equals(8));
	}
	
	@Test
	public void testTens(){
		alternate17 alter = new alternate17();
		assertTrue(alter.Tens(20).equals(6));
		alter.number = 0;
		assertTrue(alter.Switch(20).equals(6));
	}

	@Test
	public void testHundred(){
		alternate17 alter = new alternate17();
		assertTrue(alter.Hundred(100).equals(10));
		alter.number = 0;
		assertTrue(alter.Switch(100).equals(10));
	}
	
	@Test
	public void testThousand(){
		alternate17 alter = new alternate17();
		assertTrue(alter.Thousand(1000).equals(11));
		alter.number = 0;
		assertTrue(alter.Switch(1101).equals(27));
	}
}
