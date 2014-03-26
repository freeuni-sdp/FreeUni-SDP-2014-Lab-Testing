package logic;

import model.Board;
import model.Cell;
import model.CellValue;



public class ReadOnlyBoard implements ReadOnlyBoardInterface {
	
	private final Board board;
	
	public ReadOnlyBoard(Board board) {
		this.board=board;
	}
	
	/* (non-Javadoc)
	 * @see logic.ReadOnlyBoardInterface#isFull()
	 */
	public boolean isFull() {
		return board.isFull();
	}
	
	/* (non-Javadoc)
	 * @see logic.ReadOnlyBoardInterface#getValueAt(logic.CellWrapped)
	 */
	public CellValueWrapped getValueAt(CellWrapped cellWrapped) {
		Cell cell  = cellWrapped.getCell();
		CellValue cellValue = board.getValueAt(cell);
		return CellValueWrapped.fromCellValue(cellValue); 
	}
	
	/* (non-Javadoc)
	 * @see logic.ReadOnlyBoardInterface#getSize()
	 */
	public int getSize() {
		return board.getSize();
	}
	
	/* (non-Javadoc)
	 * @see logic.ReadOnlyBoardInterface#isEmpty(logic.CellWrapped)
	 */
	public boolean isEmpty(CellWrapped cellWrapped) {
		return board.isEmpty(cellWrapped.getCell());
	}

}
