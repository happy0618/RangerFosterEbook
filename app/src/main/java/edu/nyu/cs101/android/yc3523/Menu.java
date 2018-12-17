package edu.nyu.cs101.android.yc3523;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

/**
 * Create an app that displays the ebook version of Ranger Foster.
 * @author Yijia Chen yc3523
 * @version  1.1
 */
public class Menu extends AppCompatActivity {

    /**
     * A static variable that keeps tracking the current page number
     */
    public static int currentPage = 0;

    /**
     * This method is automatically called when this screen is loaded.
     * @param savedInstanceState Any saved state of this screen
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //initialize a button object
        Button start = (Button) findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            /**
             * When the user click on the start button, it turns to the cover page.
             */
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Cover.class);
                startActivity(startIntent);
            }

        });

        //initialize a button object
        Button back = (Button) findViewById(R.id.goBack);
        back.setOnClickListener(new View.OnClickListener() {
            /**
             * When the user click on the start button, it jumps to the page the user is previous on.
             */
            @Override
            public void onClick(View v) {
                if(currentPage == 0) {
                    Intent startIntent = new Intent(getApplicationContext(), Cover.class);
                    startActivity(startIntent);
                }
                else if(currentPage == 1){
                    Intent startIntent = new Intent(getApplicationContext(), One.class);
                    startActivity(startIntent);
                }
                else if(currentPage == 2){
                    Intent startIntent = new Intent(getApplicationContext(), Two.class);
                    startActivity(startIntent);
                }
                else if(currentPage == 3){
                    Intent startIntent = new Intent(getApplicationContext(), Three.class);
                    startActivity(startIntent);
                }
                else if(currentPage == 4){
                    Intent startIntent = new Intent(getApplicationContext(), Four.class);
                    startActivity(startIntent);
                }
                else if(currentPage == 5){
                    Intent startIntent = new Intent(getApplicationContext(), Five.class);
                    startActivity(startIntent);
                }
                else if(currentPage == 6){
                    Intent startIntent = new Intent(getApplicationContext(), Six.class);
                    startActivity(startIntent);
                }
                else if(currentPage == 7){
                    Intent startIntent = new Intent(getApplicationContext(), Seven.class);
                    startActivity(startIntent);
                }
                else if(currentPage == 8){
                    Intent startIntent = new Intent(getApplicationContext(), Eight.class);
                    startActivity(startIntent);
                }
                else if(currentPage == 9){
                    Intent startIntent = new Intent(getApplicationContext(), Nine.class);
                    startActivity(startIntent);
                }
            }
        });
    }
}
