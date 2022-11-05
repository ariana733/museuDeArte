public class Artista {
    private int idArtista;
    private String nomeCompleto;
    private String nomeArtistico;
    private int dataNasc; // deixando o formato de data assim pois as vezes não temos a data completa do artista
    private String localNasc;
    private int telefone;
    private String email;
    private String endereco;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;
    private String tecnicasPrincipais;

    public Artista(int idArtista, String nomeCompleto, String nomeArtistico, int dataNasc, String localNasc, int telefone, String email, String endereco, String cep, String cidade, String estado, String pais, String estilo, String tecnicasPrincipais) {
        this.idArtista = idArtista;
        this.nomeCompleto = nomeCompleto;
        this.nomeArtistico = nomeArtistico;
        this.dataNasc = dataNasc;
        this.localNasc = localNasc;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.tecnicasPrincipais = tecnicasPrincipais;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public int getDataNasc() {
        return dataNasc;
    }

    public String getLocalNasc() {
        return localNasc;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCep() {
        return cep;
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


    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setDataNasc(int dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setLocalNasc(String localNasc) {
        this.localNasc = localNasc;
    }

    public void setTelefone(String telefone) {

        if (telefone.length() <= 15){ //Um telefone de até 15 dígitos para incluir telefones internacionais
            this.telefone = Integer.parseInt(telefone);
        } else {
            System.out.println("Digite um número de telefone válido!");
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        if(endereco.trim().length() > 10){
            this.endereco = endereco.trim();
        } else {
            throw new RuntimeException("Endereço precisa ter no mínimo 10 caracteres");
        }

    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        if(cidade.trim().length() > 2) {
            this.cidade = cidade.trim();
        } else {
            throw new RuntimeException("É preciso informar qual cidade!");
        }
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setTecnicasPrincipais(String tecnicasPrincipais) {
        this.tecnicasPrincipais = tecnicasPrincipais;
    }
}
