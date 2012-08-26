package BastiMax.AppTest.game;

import BastiMax.AppTest.dev.Console;
import BastiMax.AppTest.game.GameEngine;

public class Game extends Thread{
	
	private GameEngine gameEngine;
	
	public Game()
	{
	}
		
	private void init()
	{
		Console.WriteLine("init Game...");
		
		gameEngine = new GameEngine();		
		
		Console.WriteLine("init Game ok");
	}
		
	public void run()
	{
		init();
		Console.WriteLine("Game start");
		
		gameEngine.start();
		
		while(gameEngine.isAlive());

		Console.WriteLine("Game exit");
	}
}
