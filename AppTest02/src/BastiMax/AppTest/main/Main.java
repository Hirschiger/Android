package BastiMax.AppTest.main;

import BastiMax.AppTest.dev.Console;
import BastiMax.AppTest.game.Game;

import android.widget.TextView;

public class Main extends Thread{
	
	private AppActivity app = null;
	
	private Game game;
	
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
			
		game = new Game();

		
		Console.WriteLine("init Main() ok");
	}
		
	public void run()
	{
		
		init();
		Console.WriteLine("Main() start");
		
		game.start();

		while(game.isAlive());

		
		Console.WriteLine("Main() exit");
	}
}
