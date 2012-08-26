package BastiMax.AppTest.game;

import BastiMax.AppTest.dev.Console;

public class GameEngine extends Thread{
	
	public GameEngine()
	{
	}
	
	private void init()
	{
		Console.WriteLine("init GameEngine...");
		
		
		
		Console.WriteLine("init...init...init...init");
		
		
				
		Console.WriteLine("init GameEngine ok");
	}
	
	public void run()
	{
		init();
		Console.WriteLine("GameEngine start");

		for(int i = 0; i < 3; ++i)
		{
			Console.WriteLine("Zeile");
		}
		
		Console.WriteLine("GameEngine exit");
	}
}

