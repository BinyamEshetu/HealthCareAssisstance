package com.example.healthcare;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HospitalandPharmacyInfoActivity extends AppCompatActivity {

    Spinner spinner;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacyandhospitalinfo);


        spinner = (Spinner) findViewById(R.id.spinner);
        txt = (TextView) findViewById(R.id.textV);
        txt.setText("");

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.city, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    txt.setText("Addis Abeba");
                }
                if (i == 1)
                {
                    txt.setText("Bahir Dar");
                }
                if (i == 2)
                {
                    txt.setMovementMethod(new ScrollingMovementMethod());
                    txt.setText("1 -- Debre Berhan Zonal Hospital : Kebele 02, Infornt of Silassie Meakel, 0116812020, 0921133021.\n " +
                            "2 -- Ayu Hospital : Kebele 05, Infornt of Markon House, 0116812020, 0921133021.\n " +
                            "3 -- Dr. Fiseha Clinic : Kebele 03, Infornt of Meakel Adebabay, 0116812020, 0921133021.\n" +
                            "4 -- Kebele 04 Health Center : Kebele 04, Infornt of Fabrica Megenteya, 0116812020, 0921133021." +
                            "\n---------------------------------------------------------\n" +
                            "1 -- Mar Pharmacy : Kebele 02, Infornt of DB Zonal Hospital, 0116812020, 0921133021.\n"+
                            "2 -- Debre Berhan Mehabereseb Pharmcy : Kebele 02, Next to DB Zonal Hospital, 0116812020, 0921133021.\n"+
                            "3 -- Hiwot Pharmacy : Kebele 02, Infornt of DB Zonal Hospital, 0116812020, 0921133021.\n"+
                            "4 -- RedCross Pharmacy : Kebele 02, Infornt of DB Zonal Hospital, 0116812020, 0921133021.\n"+
                            "5 -- Binyam Pharmacy : Kebele 06, Infornt of Mena Hotel, 0116812020, 0921133021.");

                }
                if (i == 3)
                {
                    txt.setText("Dessie");
                }
                if (i == 4)
                {
                    txt.setText("Jimma");
                }
                if (i == 5)
                {
                    txt.setText("Gonder");
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

}
