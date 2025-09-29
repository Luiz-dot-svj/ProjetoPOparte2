package br.com.domain;

public class SistemaRH {

    public static void main(String[] args) {

        // Criando Funcionários - POLIMORFISMO
        Funcionario[] funcionario = new Funcionario[3];

        Desenvolvedor dev = new Desenvolvedor(
                "Ana",
                "DEV001",
                5000,
                50,
                145.00);

        dev.registrarHoraExtra(10);
        funcionario[0] = dev;

        Gerente gerente = new Gerente(
                "Carlos",
                "GER001",
                8000);
        gerente.setBonusPerformace(1000.0);
        gerente.setComissao(500);
        funcionario[1] = gerente;

        Estagiário estagiario = new Estagiário(
                "Pedro",
                "EST001",
                15.00);
        estagiario.registrarHoras(35);
        funcionario[2] = estagiario;

    }
}