package com.example.verde.entity;

public class Cliente {
    private String nome, senha, tel;

    public Cliente(String nome, String senha, String tel){
        this.nome = nome;
        this.senha =  senha;
        this.tel = tel;
    }


    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getTel() {
        return tel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
