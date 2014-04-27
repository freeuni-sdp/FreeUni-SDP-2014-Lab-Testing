package src;

import java.util.ArrayList;

public class Main {
	ArrayList<Integer> commands = new ArrayList<>();
	ArrayList<Integer> undos = new ArrayList<>();


	
	public Main command(int command) {
		commands.add(command);
		return this;
	}
	
	public int undo() {
		return ERROR;
	}
	
	public int redo() {
		return ERROR;
	}
	
	public static final int ERROR = -1;
	
	
}
