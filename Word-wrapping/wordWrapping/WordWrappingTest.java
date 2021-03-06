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
	
	@Test
	public void testForWrapsThatDontMatchGivenSize(){
		ArrayList<String> correctArrayList = new ArrayList<>();
		
		correctArrayList.add("Nika");
		correctArrayList.add("midis");
		correctArrayList.add("skolashi");
		
		assertEquals(WordWrapping.wordWrap("Nika midis skolashi", 8), correctArrayList);
		
		
		correctArrayList = new ArrayList<>();
		
		correctArrayList.add("Davaleba");
		correctArrayList.add("titqmis");
		correctArrayList.add("datserili aris");

		assertEquals(WordWrapping.wordWrap("Davaleba titqmis datserili aris", 14), correctArrayList);
	}
	
	
	@Test
	public void testForGeorgian(){
		ArrayList<String> correctArrayList = new ArrayList<>();
		correctArrayList.add("სალ");
		correctArrayList.add("ომე");
		assertEquals(WordWrapping.wordWrap("სალომე", 3), correctArrayList);
		
		correctArrayList = new ArrayList<>();
		correctArrayList.add("სალო");
		correctArrayList.add("მე");
		assertEquals(WordWrapping.wordWrap("სალომე", 4), correctArrayList);
		
		correctArrayList = new ArrayList<>();
		correctArrayList.add("ნიკა მი-");
		correctArrayList.add("დის სკო-");
		correctArrayList.add("ლაში");
		assertEquals(WordWrapping.wordWrap("ნიკა მიდის სკოლაში", 8), correctArrayList);
		
		correctArrayList = new ArrayList<>();
		correctArrayList.add("ნიკა");
		correctArrayList.add("ჭკვიანი");
		correctArrayList.add("ბიჭია და");
		correctArrayList.add("კარგად");
		correctArrayList.add("სწავლობს");
		assertEquals(WordWrapping.wordWrap("ნიკა ჭკვიანი ბიჭია და კარგად სწავლობს", 8), correctArrayList);
		
		
		
	}

}
