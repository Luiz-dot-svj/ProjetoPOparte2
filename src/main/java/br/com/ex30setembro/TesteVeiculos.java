package br.com.ex30setembro;


public class TesteVeiculos {
    public static void main(String[] args) {
        Veiculo[] frota = {
                new Carro("Ford", "Fiesta", 2020, 4, true),
                new Moto("Honda", "CG 160", 2021, 160, true),
                new Carro("Volkswagen", "Golf", 2019, 4, true),
                new Carro ("Subaru" , "Impreza" , 1998, 4, true),
                new Carro("Royal Enfield", "Guerrilha 450", 2025, 0, false),
                new Carro ("fiat", "Fiorino", 2010, 2, true),

        };

        for (Veiculo veiculo : frota) {
            veiculo.exibirInfo();
            veiculo.acelerar(60);
            System.out.println("---");
        }
    }
}
