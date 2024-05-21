package com.example.firstaluraclass.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.firstaluraclass.R;

public class CadastroAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setTitle("Cadastro alunos");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cadastro_aluno);

        Button botaoSalvar = findViewById(R.id.activity_button_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CadastroAlunoActivity.this, "teste", Toast.LENGTH_SHORT);

            }
        });



    }
}