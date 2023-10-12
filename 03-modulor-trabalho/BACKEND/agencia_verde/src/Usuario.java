public class Usuario {
    private int id_usuario;
    private String cargo;
    private String nome;
    private String senha;
    private String sql;

    public Usuario(int id_usuario, String cargo, String nome, String senha){
        this.id_usuario = id_usuario;
        this.cargo = cargo;
        this.nome = nome;
        this.senha =  senha;
    }

    public void Add(){
        sql = 'insert into agenciadb ';
    }

    public void Remove(){

    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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
