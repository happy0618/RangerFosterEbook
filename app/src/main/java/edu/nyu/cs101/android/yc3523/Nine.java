package edu.nyu.cs101.android.yc3523;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * What happens on page nine
 * @author Yijia Chen yc3523
 * @version 1.1
 */
public class Nine extends AppCompatActivity {

    /**
     * This method is automatically called when this screen is loaded.
     * @param savedInstanceState Any saved state of this screen
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);

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

        //initialize a button object
        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            /**
             * When the user click on the back button, it goes to page eight
             * @param v
             */
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Eight.class);
                startActivity(startIntent);
                Menu.currentPage--;
            }
        });

        //initialize a button object
        Button next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            /**
             * When the user click on the next button, it goes to the work cited page
             * @param v
             */
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), WorkCited.class);
                startActivity(startIntent);
                Menu.currentPage++;
            }
        });


    }
}
