package basti.and.max.myfirstapp;



import android.app.Activity;

import android.os.Bundle;

import android.view.View;

import android.widget.TextView;



public class AppTest01Activity extends Activity {
    

/** Called when the activity is first created. */
    
	@Override
    
	public void onCreate(Bundle savedInstanceState) {

	        super.onCreate(savedInstanceState);

	        setContentView(R.layout.main);


        
        Console.initConsole((TextView)findViewById(R.id.txtConsole));
	
        Console.WriteLine("view created.");


        
        Main mainClass = new Main(this);

        
        mainClass.Run();

	}


    	@Override
    	public boolean onCreateOptionsMenu(Menu menu) {
        	getMenuInflater().inflate(R.menu.activity_main, menu);
        	return true;
    	}

}