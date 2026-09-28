package com.example.constraintlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

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

        // Początkowa wartość napiwku
        showPercent(sbPercent.getProgress());

        // Obsługa suwaka
        sbPercent.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    @Override
                    public void onProgressChanged(
                            SeekBar seekBar,
                            int progress,
                            boolean fromUser) {

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

        btnCalculate.setOnClickListener(v -> calculate());

        btnClear.setOnClickListener(v -> clear());
    }

    private void showPercent(int percent) {
        tvPercentValue.setText(
                getString(R.string.percent_format, percent)
        );
    }

    private void calculate() {

        String amountText =
                etAmount.getText().toString().trim();

        if (amountText.isEmpty()) {
            Toast.makeText(
                    this,
                    R.string.error_empty_amount,
                    Toast.LENGTH_SHORT
            ).show();

            return;
        }

        String peopleText =
                etPeople.getText().toString().trim();

        int people = 1;

        if (!peopleText.isEmpty()) {
            people = Integer.parseInt(peopleText);
        }

        if (people <= 0) {
            Toast.makeText(
                    this,
                    R.string.error_invalid_people,
                    Toast.LENGTH_SHORT
            ).show();

            return;
        }

        double amount = Double.parseDouble(
                amountText.replace(',', '.')
        );

        int percent = sbPercent.getProgress();

        double total =
                amount + amount * percent / 100.0;

        if (cbRound.isChecked()) {
            total = Math.ceil(total);
        }

        double perPerson = total / people;

        // Całkowita kwota
        tvResult.setText(
                getString(
                        R.string.result_format,
                        total
                )
        );

        // Kwota przypadająca na osobę
        tvPerPerson.setText(
                getString(
                        R.string.per_person_format,
                        perPerson
                )
        );

        // Pokazanie całej grupy wyników
        groupResult.setVisibility(View.VISIBLE);
    }

    private void clear() {

        etAmount.setText("");

        etPeople.setText("");

        sbPercent.setProgress(10);

        cbRound.setChecked(false);

        groupResult.setVisibility(View.GONE);
    }
}
