public class Cliente {
    private int id_cliente;
    private String nome, senha, tel;

    public Cliente(int id_cliente, String nome, String senha, String tel){
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.senha =  senha;
        this.tel = tel;
    }

    public int getId_cliente() {
        return id_cliente;
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

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
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
