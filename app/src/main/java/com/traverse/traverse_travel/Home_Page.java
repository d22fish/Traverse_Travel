package com.traverse.traverse_travel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/*i"M A LITTLE TEA CUNT*/

public class Home_Page extends AppCompatActivity {

    private static Button planVacationButton;
    private static Button exploreGlobeButton;
    private static Button networkingButton;
    private static Button emergencyCallButton;
    private static Button financesButton;
    private static Button viewCurrentTripButton;
    private static Button miscellaneousButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        planVacationButtonListener();
        exploreGlobeButtonListener();
        networkingListener();
    }


    public void planVacationButtonListener() {
        planVacationButton = (Button) findViewById(R.id.button_planVacation);
        planVacationButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.adrian.traverse_app.PlanVacation");
                        startActivity(intent);

                    }
                }
        );
    }

    public void exploreGlobeButtonListener() {
        exploreGlobeButton = (Button) findViewById(R.id.button_exploreGlobe);
        exploreGlobeButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.adrian.traverse_app.ExploreGlobeActivity");
                        startActivity(intent);

                    }
                }
        );
    }

    public void networkingListener() {
        networkingButton = (Button) findViewById(R.id.button_networking);
        networkingButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent("com.example.adrian.traverse_app.ExploreGlobeActivity");
                        startActivity(intent);

                    }
                }
        );
    }

    public void emergencyCallButtonListener() {
        emergencyCallButton = (Button) findViewById(R.id.button_emergencyCall);
        emergencyCallButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.adrian.traverse_app.PlanVacation");
                        startActivity(intent);

                    }
                }
        );
    }

    public void financesListener() {
        financesButton = (Button) findViewById(R.id.button_finances);
        financesButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent("com.example.adrian.traverse_app.ExploreGlobeActivity");
                        startActivity(intent);

                    }
                }
        );
    }

    public void ViewCurrentTripButtonListener() {
        viewCurrentTripButton = (Button) findViewById(R.id.button_viewCurrentTrip);
        viewCurrentTripButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.adrian.traverse_app.PlanVacation");
                        startActivity(intent);

                    }
                }
        );
    }

    public void miscellaneousListener() {
        miscellaneousButton = (Button) findViewById(R.id.button_miscellaneous);
        miscellaneousButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent("com.example.adrian.traverse_app.ExploreGlobeActivity");
                        startActivity(intent);

                    }
                }
        );
    }
}