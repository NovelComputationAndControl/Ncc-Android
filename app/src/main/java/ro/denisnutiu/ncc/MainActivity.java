package ro.denisnutiu.ncc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String activityTag = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    /*
     * This function will LogIn the user.
     */
    public void onLogin(View v) {
        Button loginButton = (Button) v;

        // TODO: Login User, then proceed, else display error message.

        setContentView(R.layout.activity_dashboard);
    }
}
