package edu.nyu.cs101.android.yc3523;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cover extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover);

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
        Button next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            /**
             * When the user click on the next button, it goes to page one
             * @param v
             */
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), One.class);
                startActivity(startIntent);
                Menu.currentPage++;
            }
        });
    }
}
