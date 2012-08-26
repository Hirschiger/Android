package BastiMax.AppTest.main;

import BastiMax.AppTest.dev.Console;
import BastiMax.AppTest.game.GameEngine;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Main extends Thread{
	
	private AppActivity app = null;
	
	private GameEngine game;
	
	public Main(AppActivity app)
	{
		this.app = app;
		this.app.setTitle("Spiel");
		
		Console.initConsole((TextView)app.findViewById(R.id.txtConsole));
		
		start();
	}
		
	private void init()
	{
		Console.WriteLine("init Main()...");
			
		game = new GameEngine();
			
			
			
					
		Console.WriteLine("init Main() ok");
	}
		
	public void run()
	{
		Console.WriteLine("starting Main()...");
		init();
		Console.WriteLine("starting Main() ok");
		
		game.start();
		Console.WriteLine("" + game.isAlive());
		while(game.isAlive());
		Console.WriteLine("" + game.isAlive());
		Console.WriteLine("Main() exit");
	}
}
