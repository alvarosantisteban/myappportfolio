package com.alvarosantisteban.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Displays a set of buttons, which show a different Toast (in the future, opening a new app).
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * OnClick method defined in the xml of the class.
     * @param view the clicked View
     */
    public void onAppButtonClicked(View view) {
        int textId;

        switch (view.getId()) {
            case R.id.main_movies_button:
                // Display Toast for Popular movies app
                textId = R.string.app_movies_toast;
                break;
            case R.id.main_stock_button:
                // Display Toast for Stock hawk app
                textId = R.string.app_stock_toast;
                break;
            case R.id.main_bigger_button:
                // Display Toast for Build it bigger app
                textId = R.string.app_bigger_toast;
                break;
            case R.id.main_material_button:
                // Display Toast for Make you app material app
                textId = R.string.app_material_toast;
                break;
            case R.id.main_ubiquitous_button:
                // Display Toast for Go Ubiquitous app
                textId = R.string.app_ubiquitous_toast;
                break;
            case R.id.main_capstone_button:
                // Display Toast for Capstone app
                textId = R.string.app_capstone_toast;
                break;
            default:
                textId = R.string.error_message;
        }
        Toast.makeText(this, textId, Toast.LENGTH_SHORT).show();
    }
}
