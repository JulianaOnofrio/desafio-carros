package br.zup.discovery.academy.juliana.controller;
import br.zup.discovery.academy.juliana.model.Carro;
import br.zup.discovery.academy.juliana.model.Endereco;
import br.zup.discovery.academy.juliana.model.Marca;
import br.zup.discovery.academy.juliana.model.Proprietario;
import java.lang.String;
import java.util.*;

public class TestaCarro {

    public static void main(String[] args) {
        //adicionando os objetos
        Endereco endereco0 = new Endereco("Rua doutor joão batista de lacerda", 402,
                "mooca", "são paulo", "03177010", "casa");
        Endereco endereco1 = new Endereco("Rua serra de jaire", 409,
                "mooca", "são paulo", "03187010", "casa");
        Endereco endereco2 = new Endereco("Rua itaqueri", 410,
                "mooca", "são paulo", "03177010", "casa");
        Endereco endereco3 = new Endereco("Rua da mooca", 4134,
                "mooca", "são paulo", "03138010", "casa");
        Endereco endereco4 = new Endereco("Avenida paes de barros", 87,
                "mooca", "são paulo", "03176010", "casa");
        Endereco endereco5 = new Endereco("Rua serra da bocaina", 467,
                "mooca", "são paulo", "03177010", "casa");
        Endereco endereco6 = new Endereco("Rua cassandoca", 982,
                "mooca", "são paulo", "0390010", "casa");
        Endereco endereco7 = new Endereco("Rua amor", 402,
                "mooca", "são paulo", "03477010", "casa");
        Endereco endereco8 = new Endereco("Rua felicidade", 442,
                "mooca", "são paulo", "03177010", "casa");
        Endereco endereco9 = new Endereco("Rua tobias barreto", 762,
                "mooca", "são paulo", "03887010", "casa");


        Proprietario p0 = new Proprietario("juliana", "41112006860", "354076660", "21/07/2001");
        Proprietario p1 = new Proprietario("amanda", "41312005890", "394076060", "29/09/1990");
        Proprietario p2 = new Proprietario("bianca", "41382009899", "324081060", "11/04/1991");
        Proprietario p3 = new Proprietario("silvia", "31372705890", "394096070", "20/09/1991");
        Proprietario p4 = new Proprietario("gilton", "41372009898", "394574860", "14/08/1989");
        Proprietario p5 = new Proprietario("henrique", "41315005590", "394046960", "27/02/2001");
        Proprietario p6 = new Proprietario("claudio", "61316008890", "364056860", "21/11/2001");
        Proprietario p7 = new Proprietario("rubens", "47312075800", "3394079060", "24/07/1997");
        Proprietario p8 = new Proprietario("lene", "41812706870", "394256860", "28/06/1999");
        Proprietario p9 = new Proprietario("vitor", "41412805390", "391678060", "21/03/2001");

        Marca m0 = new Marca("HONDA","Civic");
        Marca m1 = new Marca("FIAT","Argo");
        Marca m2 = new Marca("CHEVROLET","Onix");
        Marca m3 = new Marca("FORD","F-Series");
        Marca m4 = new Marca("RENAULT","Kwid");
        Marca m5 = new Marca("HYUNDAI","HB20");
        Marca m6 = new Marca("TOYOTA","Corolla");
        Marca m7 = new Marca("VOLKSWAGEN"," Golf");
        Marca m8 = new Marca("NISSAN","Kicks");
        Marca m9 = new Marca("KIA","Sportage");

        Carro carro0 = new Carro( p0, "vermelho", 1990, m0, "8171719191", 180, 0, 4,
                true, 5, true, 42);
        Carro carro1 = new Carro( p1, "azul", 1990, m1, "8471799191", 180, 0, 2,
                true, 5, true, 42);
        Carro carro2 = new Carro( p2, "vermelho", 1987, m2, "8191519191", 180, 0, 2,
                true, 5, true, 42);
        Carro carro3 = new Carro( p3, "vermelho", 1980, m3, "8188719101", 180, 0, 2,
                true, 5, true, 42);
        Carro carro4 = new Carro( p4, "vermelho", 1998, m4, "8541719191", 180, 0, 2,
                true, 5, true, 42);
        Carro carro5 = new Carro( p5, "vermelho", 1999, m5, "8171899191", 180, 0, 2,
                true, 5, true, 42);
        Carro carro6 = new Carro( p6, "vermelho", 2000, m6, "8166719991", 180, 0, 2,
                true, 5, true, 42);
        Carro carro7 = new Carro( p7, "vermelho", 1983, m7, "8173799191", 180, 0, 2,
                true, 5,true, 42);
        Carro carro8 = new Carro( p8, "vermelho", 1984, m8, "8191719991", 180, 0, 2,
                true, 5, true, 42);
        Carro carro9 = new Carro( p9, "vermelho", 1986, m9, "8971719191", 180, 0, 2,
                true, 5, true, 42);

            p0.setCarro(carro0);
            p0.setEndereco(endereco0);
            p1.setCarro(carro1);
            p1.setEndereco(endereco1);
            p2.setCarro(carro2);
            p2.setEndereco(endereco2);
            p3.setCarro(carro3);
            p3.setEndereco(endereco3);
            p4.setCarro(carro4);
            p4.setEndereco(endereco4);
            p5.setCarro(carro5);
            p5.setEndereco(endereco5);
            p6.setCarro(carro6);
            p6.setEndereco(endereco6);
            p7.setCarro(carro7);
            p7.setEndereco(endereco7);
            p8.setCarro(carro8);
            p8.setEndereco(endereco8);
            p9.setCarro(carro9);
            p9.setEndereco(endereco9);

        List<Carro> list = Arrays.asList(carro0,carro1,carro2,carro3,carro4,carro5,carro6,carro7,carro8,carro9);
        list.stream().filter(c -> c.getMarca().getNome().startsWith("f")).forEach(c -> System.out.println(c));
        list.stream().filter(c -> c.getAno() > 1990).forEach(c -> System.out.println(c));
        list.stream().filter(c -> c.getNrDePortas() > 4).forEach((c -> System.out.println(c)));
    }

}
