package com.example.healthcare;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.example.healthcare.illnesses.Allergies;
import com.example.healthcare.illnesses.Anxiety;
import com.example.healthcare.illnesses.Asthma;
import com.example.healthcare.illnesses.Bronchitis;
import com.example.healthcare.illnesses.ColdandFlu;
import com.example.healthcare.illnesses.Diarrhea;
import com.example.healthcare.illnesses.Headaches;
import com.example.healthcare.illnesses.Measles;
import com.example.healthcare.illnesses.Mononucleosis;
import com.example.healthcare.illnesses.StomachAches;
import com.google.firebase.auth.FirebaseAuth;

import java.text.DecimalFormat;

public class ProblemandSolutionActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problemandsolution);



    }

    public void allergies(View view) {
        Allergies allergies = new Allergies();
        allergies.show(getSupportFragmentManager(), "Allergies");
    }
    public void anxiety(View view) {
        Anxiety anxiety = new Anxiety();
        anxiety.show(getSupportFragmentManager(), "Anxiety");
    }
    public void asthma(View view) {
        Asthma asthma = new Asthma();
        asthma.show(getSupportFragmentManager(), "Asthma");
    }
    public void bronchitis(View view) {
        Bronchitis bronchitis = new Bronchitis();
        bronchitis.show(getSupportFragmentManager(), "Bronchitis");
    }
    public void coldandflu(View view) {
        ColdandFlu coldandflu = new ColdandFlu();
        coldandflu.show(getSupportFragmentManager(), "ColdandFlu");
    }
    public void diarrhea(View view) {
        Diarrhea diarrhea = new Diarrhea();
        diarrhea.show(getSupportFragmentManager(), "Diarrhea");
    }
    public void headaches(View view) {
        Headaches headaches = new Headaches();
        headaches.show(getSupportFragmentManager(), "Headaches");
    }
    public void measles(View view) {
        Measles measles = new Measles();
        measles.show(getSupportFragmentManager(), "Measles");
    }
    public void mononuclosis(View view) {
        Mononucleosis mononuclosis = new Mononucleosis();
        mononuclosis.show(getSupportFragmentManager(), "Mononucleosis");
    }
    public void stomachaches(View view) {
        StomachAches stomachaches = new StomachAches();
        stomachaches.show(getSupportFragmentManager(), "StomachAches");
    }
}
