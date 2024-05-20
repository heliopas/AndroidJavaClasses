package com.example.firstaluraclass.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.firstaluraclass.R;
import com.example.firstaluraclass.ui.activity.AlunoDAO.alunoDAO;


public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("APPCompatActivity");
        setContentView(R.layout.activity_main);

        alunoDAO dao = new alunoDAO();

        ListView ListaAlunos = findViewById(R.id.listAlunos);

        ListaAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dao.getAlunos()));

        Button addIcon = findViewById(R.id.buttomAdd);

        addIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListaAlunosActivity.this, CadastroAlunoActivity.class));
            }
        });

    }
}
