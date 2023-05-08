package sg.edu.rp.c346.id22034700.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText input;
    TextView display;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.textViewDisplay);
        button = findViewById(R.id.buttonDisplay);
        input = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String show = input.getText().toString();
                int checkedRadioId=rgGender.getCheckedRadioButtonId();
                if (checkedRadioId == R.id.radioButtonGenderMale){
                    String male = "He says ";
                    show = male + show;
                } else {
                    String female = "She says ";
                    show = female + show;
                }
                display.setText(show);
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbtn.isChecked()){
                    tbtn.setChecked(true);
                    input.setEnabled(true);
                } else {
                    tbtn.setChecked(false);
                    input.setEnabled(false);
                }

            }
        });

    }
}