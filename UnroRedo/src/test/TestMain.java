package src.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.Main;

public class TestMain {
	
	private Main main;
	
	@Before
	public void init(){
		main = new Main();
	}

	@Test
	public void shouldReturnErrorWhenUndoingWhenEmpty(){
		assertEquals(main.undo(), main.ERROR);
	}
	
	@Test
	public void shouldReturnErrorWhenRedoingWhenEmpty(){
		assertEquals(main.redo(), main.ERROR);
	}
	

}
