package bonch.dev.testarchitecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private TestFragment testFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testFragment = (TestFragment) getSupportFragmentManager().findFragmentByTag("test");
        if (testFragment == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer, new TestFragment(),"test").commit();
        }
        Log.d("asd", "Activity onCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("asd", "Activity onDestroy");
    }
}
