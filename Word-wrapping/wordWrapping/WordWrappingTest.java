package wordWrapping;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;

public class WordWrappingTest {

	
	
	@Test
	public void testIfReturnsList(){
		assertEquals(WordWrapping.wordWrap("", 0), new ArrayList<>());
	}

}
