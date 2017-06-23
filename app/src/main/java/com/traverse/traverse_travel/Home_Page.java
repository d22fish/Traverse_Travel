package com.traverse.traverse_travel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Home_Page extends AppCompatActivity {

    private static Button exploreGlobeButton;
    private static Button planVacationButton;
    private static Button viewCurrentVacationButton;
    private static Button storedVacationsButton;
    private static Button networkingAndSocialButton;
    private static Button emergencyCallButton;
    private static Button financesButton;
    private static Button reportNewEventOrPlaceButton;
    private static Button settingsButton;
    private static Button miscellaneousButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        exploreGlobeButtonListener();
        planVacationButtonListener();
        viewCurrentVacationButtonListener();
        storedVacationsButtonListener();
        networkingAndSocialButtonListener();
        emergencyCallButtonListener();
        financesButtonListener();
        reportNewEventOrPlaceButtonListener();
        settingsButtonListener();
        miscellaneousButtonListener();
    }

    public void exploreGlobeButtonListener() {
        exploreGlobeButton = (Button) findViewById(R.id.button_exploreGlobe);
        exploreGlobeButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.traverse.traverse_travel.ExploreGlobeActivity");
                        startActivity(intent);

                    }
                }
        );
    }

    public void planVacationButtonListener() {
        planVacationButton = (Button) findViewById(R.id.button_planVacation);
        planVacationButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.traverse.traverse_travel.PlanVacation");
                        startActivity(intent);

                    }
                }
        );
    }

    public void viewCurrentVacationButtonListener() {
        viewCurrentVacationButton = (Button) findViewById(R.id.button_viewCurrentVacation);
        viewCurrentVacationButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent("com.traverse.traverse_travel.ViewCurrentVacation");
                        startActivity(intent);

                    }
                }
        );
    }

    public void storedVacationsButtonListener() {
        storedVacationsButton = (Button) findViewById(R.id.button_storedVacations);
        storedVacationsButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.traverse.traverse_travel.StoredVacations");
                        startActivity(intent);

                    }
                }
        );
    }

    public void networkingAndSocialButtonListener() {
        networkingAndSocialButton = (Button) findViewById(R.id.button_networkingAndSocial);
        networkingAndSocialButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent("com.traverse.traverse_travel.NetworkingAndSocial");
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
                        Intent intent = new Intent("com.traverse.traverse_travel.EmergencyCall");
                        startActivity(intent);

                    }
                }
        );
    }

    public void financesButtonListener() {
        financesButton = (Button) findViewById(R.id.button_finances);
        financesButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent("com.traverse.traverse_travel.finances");
                        startActivity(intent);

                    }
                }
        );
    }

    public void reportNewEventOrPlaceButtonListener() {
        reportNewEventOrPlaceButton = (Button) findViewById(R.id.button_reportNewThing);
        reportNewEventOrPlaceButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent("com.traverse.traverse_travel.ReportNewEventOrPlace");
                        startActivity(intent);

                    }
                }
        );
    }

    public void settingsButtonListener() {
        settingsButton = (Button) findViewById(R.id.button_settings);
        settingsButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent("com.traverse.traverse_travel.settings");
                        startActivity(intent);

                    }
                }
        );
    }

    public void miscellaneousButtonListener() {
        miscellaneousButton = (Button) findViewById(R.id.button_miscellaneous);
        miscellaneousButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent("com.traverse.traverse_travel.miscellaneous");
                        startActivity(intent);

                    }
                }
        );
    }
}