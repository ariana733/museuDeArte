import java.text.DateFormat;

public class Galeria {
    private int idGaleria;
    private String nomeDaExposicao;
    private DateFormat dataDeInicio;
    private DateFormat dataDeEncerramento;
    private String endereco;
    private String cidade;
    private String estado;
    private String pais;
    private int idArtista;
    private int idObra;

    public Galeria(int idGaleria, String nomeDaExposicao, DateFormat dataDeInicio, DateFormat dataDeEncerramento, String endereco, String cidade, String estado, String pais, int idArtista, int idObra) {
        this.idGaleria = idGaleria;
        this.nomeDaExposicao = nomeDaExposicao;
        this.dataDeInicio = dataDeInicio;
        this.dataDeEncerramento = dataDeEncerramento;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.idArtista = idArtista;
        this.idObra = idObra;
    }

    public int getIdGaleria() {
        return idGaleria;
    }

    public String getNomeDaExposicao() {
        return nomeDaExposicao;
    }

    public DateFormat getDataDeInicio() {
        return dataDeInicio;
    }

    public DateFormat getDataDeEncerramento() {
        return dataDeEncerramento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public int getIdObra() {
        return idObra;
    }

    public void setNomeDaExposicao(String nomeDaExposicao) {
        this.nomeDaExposicao = nomeDaExposicao;
    }

    public void setDataDeInicio(DateFormat dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public void setDataDeEncerramento(DateFormat dataDeEncerramento) {
        this.dataDeEncerramento = dataDeEncerramento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
