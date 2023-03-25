package com.example.kaya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText editText = findViewById(R.id.editText);
        Button button  = findViewById(R.id.button);
        EditText editText2 = findViewById(R.id.editText2);
        TextView textView4 = findViewById(R.id.textView4);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        button.setBackgroundColor(getResources().getColor(R.color.gray));

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int count, int after) {
                if (s.toString().trim().length() > 0){
                    button.setBackgroundColor(getResources().getColor(R.color.ginger));
                }else {
                    button.setBackgroundColor(getResources().getColor(R.color.gray));

                }

            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence j, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence j, int start, int count, int after) {
                if (j.toString().trim().length() > 0){
                    button.setBackgroundColor(getResources().getColor(R.color.ginger));
                }else {
                    button.setBackgroundColor(getResources().getColor(R.color.gray));

                }

            }
            @Override
            public void afterTextChanged(Editable j) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = editText.getText().toString();
                String password = editText2.getText().toString();

                if ( login.equals("admin") && password.equals("admin") && textView2.getAlpha() == 1 && editText.getAlpha() == 1 &&
                        editText2.getAlpha() == 1 && textView4.getAlpha() == 1 && textView3.getAlpha() == 1){
                textView2.animate().alpha(0); editText.animate().alpha(0); editText2.animate().alpha(0);
                textView4.animate().alpha(0); textView3.animate().alpha(0);
                    Toast.makeText(MainActivity.this, " Вы успешно вошли в систему ", Toast.LENGTH_SHORT).show();

                }else {
                    textView2.animate().alpha(1); editText.animate().alpha(1); editText2.animate().alpha(1);
                    textView4.animate().alpha(1); textView3.animate().alpha(1);

                    Toast.makeText(MainActivity.this, "Вы Ввели не правильно логин или пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

}