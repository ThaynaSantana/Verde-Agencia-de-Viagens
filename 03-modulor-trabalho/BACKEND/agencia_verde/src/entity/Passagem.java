package entity;

public class Passagem {
    private int cliente, voo;
    private String dataVenda, horaVenda, codigo;
    long preco;

    public Passagem(int cliente, int voo, String dataVenda, String horaVenda, String codigo, long preco) {
        this.cliente = cliente;
        this.voo = voo;
        this.dataVenda = dataVenda;
        this.horaVenda = horaVenda;
        this.codigo = codigo;
        this.preco = preco;
    }

    public long getPreco() {
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

    public int getCliente() {
        return cliente;
    }

    public int getVoo() {
        return voo;
    }


    public void setPreco(long preco) {
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

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public void setVoo(int voo) {
        this.voo = voo;
    }
}
