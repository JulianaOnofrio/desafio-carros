package br.zup.discovery.academy.juliana.model;

public class Marca {
    private String nome;
    private String modelo;
    private String nrDeModelos;
    private String anoDeLancamento;
    private String codigoIdentificador;


    public Marca(String nome) { super(); this.nome = nome; }

    public Marca(String marca, String modelo) {
        this(marca);
        this.modelo = modelo;
    }

    public Marca(String marca, String modelo, String nrDeModelos, String anoDeLancamento,
                 String codigoIdentificador) {
        this(marca);
        this.nrDeModelos = nrDeModelos;
        this.anoDeLancamento = anoDeLancamento;
        this.codigoIdentificador = codigoIdentificador;
    }


    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getNrDeModelos() { return nrDeModelos; }
    public void setNrDeModelos(String nrDeModelos) { this.nrDeModelos = nrDeModelos; }

    public String getAnoDeLancamento() { return anoDeLancamento; }
    public void setAnoDeLancamento(String anoDeLancamento) { this.anoDeLancamento = anoDeLancamento; }

    public String getCodigoIdentificador() { return codigoIdentificador; }
    public void setCodigoIdentificador(String codigoIdentificador) { this.codigoIdentificador = codigoIdentificador; }



    @Override
    public String toString() {
        return "Marca{" +
                "nome='" + nome + '\'' +
                ", nrDeModelos='" + nrDeModelos + '\'' +
                ", anoDeLancamento='" + anoDeLancamento + '\'' +
                ", codigoIdentificador='" + codigoIdentificador + '\'' +
                '}';
    }

}

