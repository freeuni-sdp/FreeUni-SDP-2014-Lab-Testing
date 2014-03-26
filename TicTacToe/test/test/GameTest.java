package test;

import logic.Game;
import logic.GameStatus;
import logic.MoveListener;
import logic.Player;
import logic.PlayerColor;
import logic.Presenter;
import logic.ReadOnlyBoardInterface;
import logic.Referee;
import model.Board;

import org.easymock.EasyMock;
import org.junit.Test;

public class GameTest {
	
	@Test
	public void gameEndsIfRefereeReportsWin() {
		
		Board board = null;
		Player playerX = null;
		Player playerO = null;
		
		Referee refereeFake = EasyMock.createMock(Referee.class);
		EasyMock
			.expect(refereeFake.getGameStatus(EasyMock.anyObject(ReadOnlyBoardInterface.class)))
			.andStubReturn(GameStatus.OISWINNER);
		EasyMock.replay(refereeFake);
		
		Presenter presenterDummy = EasyMock.createNiceMock(Presenter.class);
		
		
		Game target = new Game(board, playerX, playerO, refereeFake, presenterDummy);
		target.play(PlayerColor.X);
	}

	
	@Test
	public void gameCallsPlayerXFirst() {
		
		Player playerXMock = EasyMock.createStrictMock(Player.class);
		playerXMock.makeMove(
				EasyMock.anyObject(ReadOnlyBoardInterface.class), 
				EasyMock.eq(PlayerColor.X), 
				EasyMock.anyObject(MoveListener.class));
		
		Referee refereeFake = new RefereeFake(1, GameStatus.XISWINNER);
		EasyMock.replay(playerXMock);
		
		Presenter presenterDummy = EasyMock.createNiceMock(Presenter.class);
		
		Game target = new Game(null, playerXMock, null, refereeFake, presenterDummy);
		target.play(PlayerColor.X);
		
		EasyMock.verify(playerXMock);
	}

}
