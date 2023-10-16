package entity;

public class Voo {
    private int vagas;
    private String preco, dataPartida, horaPartida, dataChegada, horaChegada;

    public Voo(String dataPartida, String horaPartida,String dataChegada, String horaChegada, String preco, int vagas){
        this.dataPartida = dataPartida;
        this.horaPartida = horaPartida;
        this.dataChegada = dataChegada;
        this.horaChegada = horaChegada;
        this.preco = preco;
        this.vagas = vagas;
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
