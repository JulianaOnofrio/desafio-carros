package br.zup.discovery.academy.juliana.model;

public class Carro {

    private String cor;
    private int ano;
    private String chassi;
    private int velocidadeMaxima;
    private int velocidadeAtual = 0;
    private int nrDePortas;
    private boolean tetoSolar;
    private int nrMarchas;
    private boolean cambioAutomatico;
    private int volumeDoCombustivel;
    private double kmPercorrido;

    private Proprietario dono;
    private Marca marca;


    public Carro() {
    }

    public Carro(Proprietario proprietario) {
        this.dono = proprietario;
    }

    public Carro(Proprietario proprietario, String cor, int ano, Marca marca,
                 String chassi, int velocidadeMaxima, int velocidadeAtual, int nrDePortas,
                 boolean tetoSolar, int nrMarchas, boolean cambioAutomatico, int volumeDoCombustivel) {
        super();
        this.dono = proprietario;
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
        this.chassi = chassi;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.nrDePortas = nrDePortas;
        this.tetoSolar = tetoSolar;
        this.nrMarchas = nrMarchas;
        this.cambioAutomatico = cambioAutomatico;
        this.volumeDoCombustivel = volumeDoCombustivel;
    }

    public Carro(Proprietario dono, String cor, int ano, Marca marca, String chassi, int velocidadeMaxima,
                 int velocidadeAtual, int nrDePortas, boolean tetoSolar, int nrMarchas, boolean cambioAutomatico,
                 int volumeDoCombustivel, double kmPercorrido) {

        this(dono, cor, ano, marca, chassi, velocidadeMaxima, velocidadeAtual, nrDePortas, tetoSolar,
                nrMarchas, cambioAutomatico, volumeDoCombustivel);

        this.kmPercorrido = kmPercorrido;
    }


    public Proprietario getDono() {
        return dono;
    }

    void setDono(Proprietario dono) {
        this.dono = dono;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getNrDePortas() {
        return nrDePortas;
    }

    public void setNrDePortas(int nrdeportas) {
        this.nrDePortas = nrdeportas;
    }

    public boolean getTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(boolean tetosolar) {
        this.tetoSolar = tetosolar;
    }

    public int getNrMarchas() {
        return nrMarchas;
    }

    public void setNrMarchas(int nrmarchas) {
        this.nrMarchas = nrmarchas;
    }

    public boolean getCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioautomatico) {
        this.cambioAutomatico = cambioautomatico;
    }

    public int getVolumeDoCombustivel() {
        return volumeDoCombustivel;
    }

    public void setVolumeDoCombustivel(int volumeDoCombustivel) {
        this.volumeDoCombustivel = volumeDoCombustivel;
    }

    public double getKmPercorrido() {
        return kmPercorrido;
    }

    public void setKmPercorrido(double kmPercorrido) {
        this.kmPercorrido = kmPercorrido;
    }


    // metodo que aumenta a velocidade de 1 em 1km

    public void acelerar() {
        int velocidadeMaxima = this.getVelocidadeMaxima();
        int velocidadeAtual = this.getVelocidadeAtual();

        while (velocidadeMaxima != velocidadeAtual) {
            velocidadeAtual++;
        }

        this.setVelocidadeAtual(velocidadeAtual);
        this.setKmPercorrido(velocidadeAtual);
    }

// metodo que freia o carro para velocidade 0Km

    public static void frear(Carro carro) {
        int velocidadeAtual = carro.getVelocidadeAtual();

        while (velocidadeAtual > 0) {
            velocidadeAtual--;
        }
        carro.setVelocidadeAtual(velocidadeAtual);

    }

    // troca de marcha automatica
    public static void trocarMarcha(Carro carro) {

        if (carro.getVelocidadeAtual() < 0) {
            carro.setNrMarchas(-1);
        }

        if (carro.getVelocidadeAtual() < 20) {
            carro.setNrMarchas(1);
        }
        if (carro.getVelocidadeAtual() > 20 && carro.getVelocidadeAtual() < 40) {
            carro.setNrMarchas(2);
        }
        if (carro.getVelocidadeAtual() > 40 && carro.getVelocidadeAtual() < 60) {
            carro.setNrMarchas(3);
        }
        if (carro.getVelocidadeAtual() > 60 && carro.getVelocidadeAtual() < 70) {
            carro.setNrMarchas(4);
        }
        carro.setNrMarchas(5);
    }

    //Calcular a automomia
    public double calcularAutonomia(double consumoMedio) {
        return this.kmPercorrido * consumoMedio;
    }

    @Override
    public String toString() {
     return "\nCarro{" +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", marca='" + marca + '\'' +
                ", chassi='" + chassi + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", velocidadeAtual=" + velocidadeAtual +
                ", nrDePortas=" + nrDePortas +
                ", tetoSolar=" + tetoSolar +
                ", nrMarchas=" + nrMarchas +
                ", cambioAutomatico=" + cambioAutomatico +
                ", volumeDoCombustivel=" + volumeDoCombustivel +
                ", dono=" + dono +
                ", kmPercorrido=" + kmPercorrido +
                '}';


    }
}