package BastiMax.AppTest.game;

import BastiMax.AppTest.dev.Console;

public class GameEngine extends Thread{
	
	public GameEngine()
	{
	}
	
	private void init()
	{
		Console.WriteLine("init GameEngine...");
		
		
		
		
		
		
				
		Console.WriteLine("init GameEngine ok");
	}
	
	public void run()
	{
		Console.WriteLine("starting GameEngine...");
		init();
		Console.WriteLine("starting GameEngine ok");

		for(int i = 0; i < 3; ++i)
		{
			Console.WriteLine("Zeile");
		}
		
		Console.WriteLine("GameEngine exit");
	}
}

