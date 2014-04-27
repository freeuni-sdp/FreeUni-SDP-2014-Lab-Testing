package wordWrapping;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class WordWrappingTest {

	
	@Test
	public void testSimpleWordWrap(){
		ArrayList<String> correctArrayList = new ArrayList<>();
		correctArrayList.add("Text");
		
		assertEquals(WordWrapping.wordWrap("Text", 10), correctArrayList);
	}

}
