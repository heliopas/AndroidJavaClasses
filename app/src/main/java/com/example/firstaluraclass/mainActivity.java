package com.example.firstaluraclass;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Toast.makeText(this, "Carregando...", Toast.LENGTH_LONG).show();
        //TextView aluno = new TextView(this);
        //aluno.setText("APP 3.1");
        setContentView(R.layout.activity_main);

        List<String> alunos = new ArrayList<>(Arrays.asList("João Maria", "Ana Luiza", "Marcelo Luis", "Juca", "Thomas"));
        //TextView AlunosTexto = findViewById(R.id.nomeAlunos);
        //AlunosTexto.setText(alunos.get(1));

        ListView ListaAlunos = findViewById(R.id.listAlunos);

        ListaAlunos.setAdapter(new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                alunos));



    }
}
