package logic;

public interface ReadOnlyBoardInterface {

	public boolean isFull();

	public CellValueWrapped getValueAt(CellWrapped cellWrapped);

	public int getSize();

	public boolean isEmpty(CellWrapped cellWrapped);

}