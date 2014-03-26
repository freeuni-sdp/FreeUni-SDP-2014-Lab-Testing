package test;

import static org.junit.Assert.*;
import logic.*;
import model.Board;

import org.junit.Test;
import org.easymock.*;

public class RefereeTest {

	@Test
	public void testGetGameStatusWithRealBoard() {
		// Unit Under Test არის ინტერფეისი Referee
		// ამ შემთხვევაში მისი კონკრეტული იმპლემენტაცია კლასი PrimeReferee
		// ტესტები შეიძლება იწერებოდეს აგრეთვე აბსტრაქტული კლასის ან ინტერფეისის მიმართ
		// და გამოიყენებოდეს მეტე სხვადასხვა კონკრეტული იმპლემენტაციების მიმართ.
		// Demo: Extract Method -> @Override
		
		// ამ შემთხვევაში გამოიყენება ნამდვილი Dependency-ები.
		// მინუსები: 1.ნელია  2.ტესტში კლასი ეყრდნობა უცხო კლასის სისწორეს. 3. მოუხერხებელია.
		
		// Arrange
		Board board = new Board();
		ReadOnlyBoardInterface readOnlyBoard = new ReadOnlyBoard(board);
		Referee target = CreateReferee();
		// Act
		GameStatus actual = target.getGameStatus(readOnlyBoard);
		// Assert
		assertEquals(GameStatus.INPROGRESS, actual);
	}
	
	@Test
	public void testGetGameStatusWithRealBoard1() {
				
		// Arrange
		Board board = new Board();
		ReadOnlyBoardInterface readOnlyBoard = new ReadOnlyBoard(board);
		Referee target = CreateReferee();
		// Act
		GameStatus actual = target.getGameStatus(readOnlyBoard);
		// Assert
		assertEquals(GameStatus.INPROGRESS, actual);
	}

	protected Referee CreateReferee() {
		return new PrimeReferee();
	}

	@Test
	public void testGetGameStatusWithBoardStub() {

		// Stub-ის საკუთარი რეალიზაცია
		// საკუთარი "TestLanguage"-ი მოსახერხებელი Setup-ისათვის xxo--o--o
		// მინუსები: საჭიროა ცალკე იმპლემენტაცია.
		
		ReadOnlyBoardInterface readOnlyBoard = new ReadOnlyBoardStub("xxo--o--o");
		Referee target = CreateReferee();

		GameStatus actual = target.getGameStatus(readOnlyBoard);

		assertEquals(GameStatus.OISWINNER, actual);
	}

	@Test
	public void testGetGameStatusWithBoardStub1() {

		//1. Mock / Stub-ის შექმნა
		ReadOnlyBoardInterface boardStub = 
				EasyMock
					.createMock(ReadOnlyBoardInterface.class);
		
		EasyMock.expect(boardStub.getSize()).andStubReturn(3);
		EasyMock.expect(boardStub.getValueAt(EasyMock.anyObject(CellWrapped.class))).andStubReturn(CellValueWrapped.X);
		
		EasyMock.replay(boardStub);
		
		Referee target = CreateReferee();

		GameStatus actual = target.getGameStatus(boardStub);

		assertEquals(GameStatus.XISWINNER, actual);
	}
	
	@Test
	public void testGetGameStatusWithBoardFake() {

		//Fake
		ReadOnlyBoardInterface boardFake = EasyMock
				.createNiceMock(ReadOnlyBoardInterface.class);
		EasyMock.replay(boardFake);
		
		Referee target = CreateReferee();

		GameStatus actual = target.getGameStatus(boardFake);

		assertEquals(GameStatus.INPROGRESS, actual);
	}
}
