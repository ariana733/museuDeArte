public class ObraDeArte {
    private int idObra;
    private String titulo;
    private int ano;
    private String descricao;
    private String tecnica;
    private int idArtista;

    public ObraDeArte(int idObra, String titulo, int ano, String descricao, String tecnica, int idArtista) {
        this.idObra = idObra;
        this.titulo = titulo;
        this.ano = ano;
        this.descricao = descricao;
        this.tecnica = tecnica;
        this.idArtista = idArtista;
    }

    public int getIdObra() {
        return idObra;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTecnica() {
        return tecnica;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public void setTitulo(String titulo) {
        if(titulo.trim().length() < 1){
            this.titulo = titulo.trim();
        } else {
            throw new RuntimeException("É obrigatório informar o título da obra!");
        }

    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }
}
