package entity;

public class Usuario {
    private String cargo;
    private String nome;
    private String senha;
    private String sql;

    public Usuario(String nome, String senha, String cargo){
        this.nome = nome;
        this.senha =  senha;
        this.cargo = cargo;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
