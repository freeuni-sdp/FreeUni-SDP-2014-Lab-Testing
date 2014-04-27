package src;

import java.util.ArrayList;

public class Main {
	ArrayList<Integer> commands = new ArrayList<>();
	
	public Main command(int command){
		commands.add(command);
		return this;
	}
	
	public boolean undo(int command) {
		int lastCommand = commands.get(commands.size() - 1);
		if (command != lastCommand) return false;
		return true;
	}
	
	public boolean redo(int command) {
		
		return false;
	}
}
