package br.zup.discovery.academy.juliana.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Proprietario {
    private String nome;
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;

    private Endereco endereco;
    private Carro carro;

    public Proprietario(String nome, String cpf, String rg, String strDataDeNascimento) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;

        this.dataNascimento = strToLocalDate(strDataDeNascimento);

    }

    public Proprietario(String nome, String cpf, String rg, String strDataDeNascimento,
                        Endereco endereco) {
        this(nome, cpf, rg, strDataDeNascimento);
        this.endereco = endereco;
    }

    public Proprietario(String nome, String cpf, String rg, String strDataDeNascimento,
                        Endereco endereco, Carro carro) {
        this(nome, cpf, rg, strDataDeNascimento, endereco);
        this.carro = carro;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getRg() { return rg; }
    public void setRg(String rg) { this.rg = rg; }

    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }

    public Carro getCarro() { return carro; }
    public void setCarro(Carro carro) { this.carro = carro; }

    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }


    //  Metodos
    public LocalDate strToLocalDate(String dataNascimento) {
        DateTimeFormatter formt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dataNascimento, formt);
    }

    public int idade() {
        if( getDataNascimento() != null ) {
            final LocalDate dataAtual = LocalDate.now();
            final Period periodo = Period.between(getDataNascimento(), dataAtual);
            return periodo.getYears();
        }
        return 0;
    }



    @Override
    public String toString () {
        return "\nProprietario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", nascimento=" + dataNascimento +
                ", idade='" + idade() + '\'' +
//                ", \ncarro" + carro +
                ", \nendereco" + endereco +
                '}';
    }
}