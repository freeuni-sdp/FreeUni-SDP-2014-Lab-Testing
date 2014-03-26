package test;

import logic.GameStatus;
import logic.ReadOnlyBoardInterface;
import logic.Referee;

class RefereeFake implements Referee {


	private int count;
	private final int numberOfMoves; 
	private final GameStatus finalResult;
	
	public RefereeFake(int numberOfMoves, GameStatus finalResult) {
		this.numberOfMoves = numberOfMoves;
		this.finalResult = finalResult;
		count=0;
	}
	
	@Override
	public GameStatus getGameStatus(ReadOnlyBoardInterface board) {
		if (count==numberOfMoves) {
			return finalResult;
		}
		
		count++;
		return GameStatus.INPROGRESS;
	}
}