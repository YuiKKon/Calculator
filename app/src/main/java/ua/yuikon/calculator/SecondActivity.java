package ua.yuikon.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    //километры
    private float convertToMeters(float k) {
        return (float) (k * 100);
    }

    //метры
    private float convertToKilometrs(float m) {
        return (float) (m * 1000);
    }

    public void onClick(View view) {

        RadioButton mRadioBtn = findViewById(R.id.kBTN);
        EditText input = findViewById(R.id.editText);

        if (input.getText().length() == 0) {
            Toast.makeText(getApplicationContext(), "Введите длину",
                    Toast.LENGTH_LONG).show();
            return;
        }

        float inputValue = Float.parseFloat(input.getText().toString());
        if (mRadioBtn.isChecked()) {
            input.setText(String.valueOf(convertToKilometrs(inputValue)));
        } else {
            input.setText(String.valueOf(convertToMeters(inputValue)));
        }

    }

}