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
	
	
	@Test
	public void shouldUndoLastCommands(){
		main.command(1).command(2).command(3);
		assertEquals(main.undo(), 3);
		assertEquals(main.undo(), 2);
		assertEquals(main.undo(), 1);
	}

}
