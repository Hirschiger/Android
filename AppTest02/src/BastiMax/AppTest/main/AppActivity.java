package BastiMax.AppTest.main;

import android.app.Activity;
import android.os.Bundle;

public class AppActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        findViewById(R.layout.main);
        Main mainthread = new Main(this);
    }
}