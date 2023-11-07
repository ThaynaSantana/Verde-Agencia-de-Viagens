public class Voo {
    private int id_voo, vagas;
    private String preco, dataPartida, horaPartida, dataChegada, horaChegada;

    public Voo(int id_voo, int vagas, String preco, String dataPartida, String horaPartida, String dataChegada, String horaChegada){
        this.id_voo = id_voo;
        this.vagas = vagas;
        this.preco = preco;
        this.dataPartida = dataPartida;
        this.horaPartida = horaPartida;
        this.dataChegada = dataChegada;
        this.horaChegada = horaChegada;
    }

    public int getId_voo() {
        return id_voo;
    }

    public int getVagas() {
        return vagas;
    }

    public String getPreco() {
        return preco;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public String getHoraChegada() {
        return horaChegada;
    }

    public void setId_voo(int id_voo) {
        this.id_voo = id_voo;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

    public void setHoraChegada(String horaChegada) {
        this.horaChegada = horaChegada;
    }
}
