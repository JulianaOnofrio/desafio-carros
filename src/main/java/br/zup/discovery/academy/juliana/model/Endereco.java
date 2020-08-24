package br.zup.discovery.academy.juliana.model;


public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String estado;
    private String cep;
    private String complemento;

    private Proprietario dono;


    //metodo construtor
    public Endereco(String rua, int numero, String bairro, String estado, String cep, String complemento) {
        super();
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;
    }



    public String getRua() { return rua; }
    public void setRua(String rua) { this.rua = rua; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }

    public Proprietario getDono() { return dono; }
    public void setDono(Proprietario dono) { this.dono = dono; }


    @Override
    public String toString() {
        return "\nEndereco{" +
                "rua='" + rua + '\'' +
                "número='" + numero + '\'' +
                ", bairro='" + bairro + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
