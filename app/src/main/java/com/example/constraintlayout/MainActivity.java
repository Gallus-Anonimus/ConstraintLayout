package com.example.constraintlayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;

public class MainActivity extends AppCompatActivity {

    private EditText etAmount;
    private EditText etPeople;
    private SeekBar sbPercent;
    private TextView tvPercentValue;
    private TextView tvResult;
    private TextView tvPerPerson;
    private CheckBox cbRound;
    private Group groupResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAmount = findViewById(R.id.etAmount);
        etPeople = findViewById(R.id.etPeople);
        sbPercent = findViewById(R.id.sbPercent);
        tvPercentValue = findViewById(R.id.tvPercentValue);
        tvResult = findViewById(R.id.tvResult);
        tvPerPerson = findViewById(R.id.tvPerPerson);
        cbRound = findViewById(R.id.cbRound);
        groupResult = findViewById(R.id.groupResult);

        Button btnCalculate = findViewById(R.id.btnCalculate);
        Button btnClear = findViewById(R.id.btnClear);

        showPercent(sbPercent.getProgress());

        sbPercent.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    @Override
                    public void onProgressChanged(
                            SeekBar seekBar,
                            int progress,
                            boolean fromUser
                    ) {
                        showPercent(progress);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                }
        );
    }

    private void showPercent(int percent) {
        tvPercentValue.setText(
                getString(R.string.percent_format, percent)
        );
    }
}