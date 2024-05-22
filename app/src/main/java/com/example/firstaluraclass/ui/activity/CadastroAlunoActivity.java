package com.example.firstaluraclass.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.firstaluraclass.R;
import com.example.firstaluraclass.ui.activity.AlunoDAO.alunoDAO;
import com.example.firstaluraclass.ui.activity.model.aluno;


public class CadastroAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setTitle("Cadastro alunos");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cadastro_aluno);

        final EditText cpf = findViewById(R.id.activity_cadastro_aluno_cpf);
        final EditText datanascimento = findViewById(R.id.activity_cadastro_aluno_data_nascimento);
        final EditText email = findViewById(R.id.activity_cadastro_aluno_mail);
        final EditText nome = findViewById(R.id.activity_cadastro_aluno_nome);



        Button botaoSalvar = findViewById(R.id.activity_button_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String cpfStr = cpf.getText().toString();
                String dataNasciStr = datanascimento.getText().toString();
                String emailStr = email.getText().toString();
                String nomeStr = nome.getText().toString();

                alunoDAO DAO = new alunoDAO();

                aluno alunoNovo = new aluno(nomeStr, cpfStr, emailStr, dataNasciStr);
                DAO.salva(alunoNovo);

//                startActivity(new Intent(CadastroAlunoActivity.this, ListaAlunosActivity.class));
                finish();

            }
        });



    }

    @Override
    protected void onResume() {
        super.onResume();

        Button botaoDel = findViewById(R.id.activity_button_deletar);

        final EditText cpf = findViewById(R.id.activity_cadastro_aluno_cpf);
        String cpfStr = cpf.getText().toString();

        botaoDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alunoDAO DAP = new alunoDAO();

                Toast.makeText(CadastroAlunoActivity.this, DAP.getAlunos().toString(), Toast.LENGTH_SHORT).show();
                Toast.makeText(CadastroAlunoActivity.this, "teste", Toast.LENGTH_LONG);
            }
        });

    }
}