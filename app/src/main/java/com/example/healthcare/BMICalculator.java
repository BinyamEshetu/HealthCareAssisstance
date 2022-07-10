package com.example.healthcare;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

import java.text.DecimalFormat;

public class BMICalculator extends AppCompatDialogFragment {

    private EditText height, weight;
    private Button calculate;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_bmicalculate_dialog, null);

        height = view.findViewById(R.id.height);
        weight = view.findViewById(R.id.weight);
        calculate = view.findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String heightStr = height.getText().toString();
                double height = Double.parseDouble(heightStr);
                double heightM = height/100;
                String weightStr = weight.getText().toString();
                double weight = Double.parseDouble(weightStr);
                double BMI = (weight) / (heightM * heightM);
                DecimalFormat df = new DecimalFormat("#.#");
                double BMI_trimmed = Double.parseDouble(df.format(BMI));
                Toast.makeText(getActivity(), Double.toString(BMI_trimmed), Toast.LENGTH_SHORT).show();
                String BMI_Cat;
                if (BMI < 15){
                    BMI_Cat = "Very severely underweight";
                }
                else if (BMI >= 15 && BMI < 16){
                    BMI_Cat = "Severely underweight";
                }
                else if (BMI >=16 && BMI < 18.5){
                    BMI_Cat = "Underweight";
                }
                else if (BMI >=18.5 && BMI < 25){
                    BMI_Cat = "Normal";
                }
                else if (BMI >= 25 && BMI < 30){
                    BMI_Cat = "Overweight";
                }
                else if (BMI>=30 && BMI < 35 ){
                    BMI_Cat = "Obese Class 1 - Moderately Obese";
                }
                else if (BMI>= 35 && BMI < 40){
                    BMI_Cat = "Obese Class 2 - Severely Obese";
                }
                else {
                    BMI_Cat = "Obese Class 3 - Very Severely Obese";

                }
                Toast.makeText(getActivity(), String.valueOf(BMI_Cat), Toast.LENGTH_SHORT).show();



            }
        });




        builder.setView(view);
        return builder.create();
    }


}
