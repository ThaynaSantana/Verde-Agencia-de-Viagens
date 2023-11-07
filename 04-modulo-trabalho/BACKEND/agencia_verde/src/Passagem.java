public class Passagem {
    private int id_passagem;
    private String preco, codigo, dataVenda, horaVenda;
    private Cliente cliente;
    private Voo voo;

    public Passagem(int id_passagem, String preco, String codigo, Cliente cliente, Voo voo, String dataVenda, String horaVenda){
        this.id_passagem = id_passagem;
        this.preco = preco;
        this.codigo = codigo;
        this.cliente = cliente;
        this.voo = voo;
        this.dataVenda = dataVenda;
        this.horaVenda = horaVenda;
    }

    public int getId_passagem() {
        return id_passagem;
    }

    public String getPreco() {
        return preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public String getHoraVenda() {
        return horaVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setId_passagem(int id_passagem) {
        this.id_passagem = id_passagem;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void setHoraVenda(String horaVenda) {
        this.horaVenda = horaVenda;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }
}
