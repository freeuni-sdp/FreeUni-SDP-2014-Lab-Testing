package test;

import logic.CellValueWrapped;
import logic.CellWrapped;
import logic.ReadOnlyBoardInterface;

public class ReadOnlyBoardStub implements ReadOnlyBoardInterface {

	private final String boardLayout;
	
	public ReadOnlyBoardStub(String boardLyout) {
		this.boardLayout = boardLyout.toUpperCase();
	}
	
	@Override
	public boolean isFull() {
		return !boardLayout.contains(" ");
	}

	@Override
	public CellValueWrapped getValueAt(CellWrapped cellWrapped) {
		int index = cellWrapped.getX() + cellWrapped.getY();
		Character charAtIndex = boardLayout.charAt(index);
		return charToValue(charAtIndex);
	}

	private CellValueWrapped charToValue(Character charAtIndex) {
		switch(charAtIndex) {
			case 'X':
				return CellValueWrapped.X;
			case 'O':
				return CellValueWrapped.O;
			case '-':
				return CellValueWrapped.EMPTY;
		}
		throw new IllegalArgumentException("Only chars 'X', 'O', '-' are supported");
	}

	@Override
	public int getSize() {
		return (int)Math.sqrt(boardLayout.length());
	}

	@Override
	public boolean isEmpty(CellWrapped cellWrapped) {
		return getValueAt(cellWrapped)==CellValueWrapped.EMPTY;
	}

}
