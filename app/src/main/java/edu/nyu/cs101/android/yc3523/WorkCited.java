package edu.nyu.cs101.android.yc3523;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * What happens on the work cited page
 * @author Yijia Chen yc3523
 * @version 1.1
 */

public class WorkCited extends AppCompatActivity {

    /**
     * This method is automatically called when this screen is loaded.
     * @param savedInstanceState Any saved state of this screen
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_cited);

        //initialize a button object
        Button menu = (Button) findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            /**
             * when the user click on the menu button, it returns to the menu
             * @param v
             */
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Menu.class);
                startActivity(startIntent);
            }
        });
    }
}
