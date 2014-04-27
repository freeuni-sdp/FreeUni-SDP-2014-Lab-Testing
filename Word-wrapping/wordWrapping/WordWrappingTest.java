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
	
	
	@Test
	public void testForShorterLengthThanText(){
		ArrayList<String> correctArrayList = new ArrayList<>();
		correctArrayList.add("T");
		correctArrayList.add("e");
		correctArrayList.add("x");
		correctArrayList.add("t");
		
		assertEquals(WordWrapping.wordWrap("Text", 1), correctArrayList);
		
		
	}
	
	@Test
	public void testForLengthTwo(){
		ArrayList<String> correctArrayList = new ArrayList<>();
		correctArrayList.add("Te");
		correctArrayList.add("xt");
		assertEquals(WordWrapping.wordWrap("Text", 2), correctArrayList);
		
	}
	
	@Test
	public void testForStringsThatDontWrapEqually(){
		ArrayList<String> correctArrayList = new ArrayList<>();
		correctArrayList.add("Tex");
		correctArrayList.add("t");
		assertEquals(WordWrapping.wordWrap("Text", 3), correctArrayList);
		
		correctArrayList = new ArrayList<>();
		correctArrayList.add("Salo");
		correctArrayList.add("me");
		assertEquals(WordWrapping.wordWrap("Salome", 4), correctArrayList);
		
		correctArrayList = new ArrayList<>();
		correctArrayList.add("Univ");
		correctArrayList.add("erci");
		correctArrayList.add("ty");
		assertEquals(WordWrapping.wordWrap("Univercity", 4), correctArrayList);
		
	}
	

	@Test
	public void testForEmptyStringOrZeroLength(){
		
		ArrayList<String> correctArrayList = new ArrayList<>();
		
		assertEquals(WordWrapping.wordWrap("", 4), correctArrayList);
		
		correctArrayList = new ArrayList<>();
		
		assertEquals(WordWrapping.wordWrap("Text", 0), correctArrayList);
	}
	
	
	@Test
	public void testForMoreThanOneWords(){
		ArrayList<String> correctArrayList = new ArrayList<>();
		
		correctArrayList.add("abc");
		correctArrayList.add("def");
		
		assertEquals(WordWrapping.wordWrap("abc def", 3), correctArrayList);
		
		correctArrayList = new ArrayList<>();
		
		correctArrayList.add("abc");
		correctArrayList.add("def");
		correctArrayList.add("abc");
		assertEquals(WordWrapping.wordWrap("abcdef abc", 3), correctArrayList);
		
		correctArrayList = new ArrayList<>();
		correctArrayList.add("a b");
		correctArrayList.add("c d");
		correctArrayList.add("e f");
		assertEquals(WordWrapping.wordWrap("a b c d e f", 3), correctArrayList);
		

	}

}
