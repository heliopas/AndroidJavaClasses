package com.example.firstaluraclass;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class mainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("APPCompatActivity");
        setContentView(R.layout.activity_main);

        List<String> alunos = new ArrayList<>();

        alunos.add("Joao");
        alunos.add("Matheus");
        alunos.add("Pabulo Antonio");

        ListView ListaAlunos = findViewById(R.id.listAlunos);

        ListaAlunos.setAdapter(new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                alunos));

    }
}
