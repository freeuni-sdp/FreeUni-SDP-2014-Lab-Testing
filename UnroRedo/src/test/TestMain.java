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

	@Test
	public void shouldRedoLastUndos() {
		main.command(1).command(2).command(3);
		main.undo();
		main.undo();
		main.undo();
		assertEquals(main.redo(), 1);
		assertEquals(main.redo(), 2);
		assertEquals(main.redo(), 3);
	}
	@Test
	public void shouldNotRedoAfterCommand(){
		main.command(1);
		main.undo();
		main.command(2);
		assertEquals(main.redo(), main.ERROR);
	}
}
