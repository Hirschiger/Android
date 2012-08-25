package basti.and.max.myfirstapp;

import android.widget.LinearLayout;

public class Main {
	
	private AppTest01Activity app = null;
	
	public Main(AppTest01Activity app)
	{
		this.app = app;
		app.setTitle("Spiel");
		
		Console.WriteLine("main() initiated.");
	}
	
	public void Run()
	{
		Console.WriteLine("starting main thread ...");
		
		for(int i = 0; i < 15; ++i)
		{
			Console.WriteLine("Zeile");
		}
		
		
	}
	
	public void Stop()
	{
		
	}

}
