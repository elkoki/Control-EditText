package com.elkoki.controledittext;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText usrname, pswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        usrname = (EditText) findViewById(R.id.txt_usrname);
        pswd = (EditText) findViewById(R.id.txt_pswd);
    }
    public void Verify (View view) {
        String username = usrname.getText().toString();
        String password = pswd.getText().toString();

        if (username.length() == 0) {
            Toast.makeText(this, "Username is empty", Toast.LENGTH_LONG).show();
        }
        if (password.length() == 0) {
            Toast.makeText(this, "Password is empty", Toast.LENGTH_LONG).show();
        }
        if (username.length() != 0 && password.length() != 0) {
            Toast.makeText(this, "Verified!", Toast.LENGTH_LONG).show();
        }
    }
}