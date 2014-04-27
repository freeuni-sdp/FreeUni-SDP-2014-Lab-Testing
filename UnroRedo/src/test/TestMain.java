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
	public void shouldReturnTrueWhenUndoingLastCommand(){
		main.command(1).command(2).command(3).command(4);
		assertTrue(main.undo(4));
	}
	
	@Test
	public void shouldReturnTrueWhenUndoingTwoLastCommands(){
		main.command(1).command(2).command(3);
		assertTrue(main.undo(3));
		assertTrue(main.undo(2));
	}

}
