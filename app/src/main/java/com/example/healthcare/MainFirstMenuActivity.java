package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.healthcare.DoctorUI.DisplayDoctorProfileInfo;
import com.example.healthcare.DoctorUI.DoctorAppointments;
import com.example.healthcare.DoctorUI.DoctorMenuActivity;
import com.example.healthcare.DoctorUI.MyPatientsActivity;
import com.example.healthcare.DoctorUI.SearchPatientActivity;

public class MainFirstMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_menu);
    }


    public void healthNews(View view) {
        Intent intent = new Intent(MainFirstMenuActivity.this, HealthNewsActivity.class);
        startActivity(intent);
    }

    public void problemandsolution(View view) {
        Intent intent = new Intent(MainFirstMenuActivity.this, ProblemandSolutionActivity.class);
        startActivity(intent);
    }

    public void hospitalandpharmacyinfo(View view) {
        Intent intent = new Intent(MainFirstMenuActivity.this, HospitalandPharmacyInfoActivity.class);
        startActivity(intent);
    }

    public void bmicalculator(View view) {
        BMICalculator bmiDialog = new BMICalculator();
        bmiDialog.show(getSupportFragmentManager(), "calculate BMI dialog");
    }

    public void account(View view) {
        Intent intent = new Intent(MainFirstMenuActivity.this, MainActivity.class);
        startActivity(intent);
    }

}