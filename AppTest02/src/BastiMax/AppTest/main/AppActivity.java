package BastiMax.AppTest.main;

import android.app.Activity;
import android.os.Bundle;

public class AppActivity extends Activity {
    /** Called when the activity is first created. */
	
	//private Main mainThread = null;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		Main mainThread = new Main(this);
    }
}