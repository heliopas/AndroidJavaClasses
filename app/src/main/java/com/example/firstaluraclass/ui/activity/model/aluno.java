package com.example.firstaluraclass.ui.activity.model;

import androidx.annotation.NonNull;

public class aluno {
    private final String nomeStr;
    private final String cpfStr;
    private final String emailStr;
    private final String dataNasciStr;

    public aluno(String nomeStr, String cpfStr, String emailStr, String dataNasciStr) {
        this.nomeStr = nomeStr;
        this.cpfStr = cpfStr;
        this.emailStr = emailStr;
        this.dataNasciStr = dataNasciStr;
    }

    public String getNomeStr() {
        return nomeStr;
    }

    public String getCpfStr() {
        return cpfStr;
    }

    public String getEmailStr() {
        return emailStr;
    }

    public String getDataNasciStr() {
        return dataNasciStr;
    }

    @NonNull
    @Override
    public String toString() {
        return nomeStr;
    }
}
