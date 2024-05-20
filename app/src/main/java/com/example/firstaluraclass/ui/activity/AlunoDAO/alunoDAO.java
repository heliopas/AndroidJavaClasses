package com.example.firstaluraclass.ui.activity.AlunoDAO;

import com.example.firstaluraclass.ui.activity.model.aluno;

import java.util.ArrayList;
import java.util.List;

public class alunoDAO {

    private final static List<aluno> alunos= new ArrayList<>();

    public void salva(aluno alunoNovo) {
        alunos.add(alunoNovo);
    }

    public List<aluno> getAlunos() {
        return new ArrayList<>(alunos);
    }
}
