package com.example.pdm_androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
    }

    private EditText EditEmail;
    private EditText EditSenha;

    private Button button;

    public void Goto_next_activity(View view)
    {
        EditEmail = findViewById(R.id.EditEmail);
        EditSenha = findViewById(R.id.EditSenha);

        Intent intention = new Intent(this, MainActivity2.class);
        String email = EditEmail.getText().toString();
        String senha = EditSenha.getText().toString();

        intention.putExtra("email", email);
        intention.putExtra("senha", senha);

        startActivity(intention);
    }
}