package logic;



public interface Player {

	void makeMove(ReadOnlyBoardInterface board, PlayerColor color, MoveListener moveListener);
}