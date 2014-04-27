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
		if (commands.size() < 1) return ERROR;
		int command = commands.get(commands.size() - 1);
		commands.remove(commands.size() - 1);
		return command;
	}
	
	public int redo() {
		return ERROR;
	}
	
	public static final int ERROR = -1;
	
	
}
