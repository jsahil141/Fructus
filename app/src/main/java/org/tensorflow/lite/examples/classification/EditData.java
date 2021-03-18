package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EditData extends AppCompatActivity {
public TextView edit_text;
public TextView edit_text_info;
public Button btnReturn1;
    String sname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_activity);
        edit_text = (TextView) findViewById(R.id.edit_text_name);
        edit_text_info = (TextView) findViewById(R.id.edit_text_info);
        btnReturn1 = (Button) findViewById(R.id.buttonrtn);

        Intent recievedTent = getIntent();
        sname = recievedTent.getStringExtra("name");
        edit_text.setText(sname);


        if (sname.equals(" Unidentifiable")) {
            edit_text_info.setText(" Input is not defined");

        }
        if (sname.equals(" Apple")) {
            edit_text_info.setText(" Nutrition Facts of Apple\n");
            edit_text_info.append(" Amount Per 100 grams\n" + " Calories: 52\n" + " Total Fat: 0.2 g\n"
            + " Sodium: 1 mg\n" + " Potassium: 107 mg\n" + " Total Carbohydrate: 14 g\n" + " Protein: 0.3 g\n");
            edit_text_info.append("----------------------------------------------\n");
            edit_text_info.append(" Vitamin A: 1%\n" + " Vitamin C: 7%\n" + " Magnesium: 1%");
        }
        if (sname.equals(" Banana")) {
            edit_text_info.setText(" Nutrition Facts of Banana\n");
            edit_text_info.append(" Amount Per 100 grams\n" + " Calories: 89\n" + " Total Fat: 0.3 g\n"
                    + " Sodium: 1 mg\n" + " Potassium: 358 mg\n" + " Total Carbohydrate: 23 g\n" + " Protein: 1.1 g\n");
            edit_text_info.append("-----------------------------------------------\n");
            edit_text_info.append(" Vitamin A: 1%\n" + " Vitamin C: 14%\n" + " Magnesium: 6%\n" + " Iron: 1%\n" + " Vitamin B-6: 20%\n");
        }
        if (sname.equals(" Dragon-Fruit")) {
            edit_text_info.setText(" Nutrition Facts of Dragon-Fruit\n");
            edit_text_info.append(" Amount Per 100 grams\n" + " Calories: 260k\n"
                    + " Sodium: 39 mg\n" + " Total Carbohydrate: 82.14 g\n" + " Protein: 3.57 g\n");
            edit_text_info.append("-----------------------------------------------\n");
            edit_text_info.append(" Vitamin C: 11%\n" + " Calcium: 11%\n" + " Sodium: 3%\n");

        }
        if (sname.equals(" Grapes")) {
            edit_text_info.setText(" Nutrition Facts of Grapes\n");
            edit_text_info.append(" Amount Per 100 grams\n" + " Calories: 67\n" + " Total Fat: 0.4 g\n"
                    + " Sodium: 2 mg\n" + " Potassium: 191 mg\n" + " Total Carbohydrate: 17 g\n" + " Protein: 0.6 g\n");
            edit_text_info.append("-----------------------------------------------\n");
            edit_text_info.append(" Vitamin A: 2%\n" + " Vitamin C: 6%\n" + " Magnesium: 1%\n" + " Iron: 1%\n" + " Vitamin B-6: 5%\n" + " Calcium: 1%");

        }
        if (sname.equals(" Mango")) {
            edit_text_info.setText(" Nutrition Facts of Mango\n");
            edit_text_info.append(" Amount Per 100 grams\n" + " Calories: 60\n" + " Total Fat: 0.4 g\n"
                    + " Sodium: 1 mg\n" + " Potassium: 168 mg\n" + " Total Carbohydrate: 15 g\n" + " Protein: 0.8 g\n");
            edit_text_info.append("-----------------------------------------------\n");
            edit_text_info.append(" Vitamin A: 21%\n" + " Vitamin C: 60%\n" + " Magnesium: 2%\n" + " Iron: 1%\n" + " Vitamin B-6: 5%\n" + " Calcium: 1%");

        }
        if (sname.equals(" Pineapple")) {
            edit_text_info.setText(" Nutrition Facts of Pineapple\n");
            edit_text_info.append(" Amount Per 100 grams\n" + " Calories: 50\n" + " Total Fat: 0.1 g\n"
                    + " Sodium: 1 mg\n" + " Potassium: 109 mg\n" + " Total Carbohydrate: 13 g\n" + " Protein: 0.5 g\n");
            edit_text_info.append("-----------------------------------------------\n");
            edit_text_info.append(" Vitamin A: 1%\n" + " Vitamin C: 79%\n" + " Magnesium: 3%\n" + " Iron: 1%\n" + " Vitamin B-6: 5%\n" + " Calcium: 1%");
        }
        if (sname.equals(" Strawberry")) {
            edit_text_info.setText(" Nutrition Facts of Strawberry\n");
            edit_text_info.append(" Amount Per 100 grams\n" + " Calories: 33\n" + " Total Fat: 0.3 g\n"
                    + " Sodium: 1 mg\n" + " Potassium: 153 mg\n" + " Total Carbohydrate: 8 g\n" + " Protein: 0.7 g\n");
            edit_text_info.append("-----------------------------------------------\n");
            edit_text_info.append(" Vitamin C: 97%\n" + " Magnesium: 3%\n" + " Iron: 2%\n" + " Calcium: 1%");

        }

        btnReturn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(EditData.this, CameraActivity.class);
                startActivity(i);

            }
        });




    }
}