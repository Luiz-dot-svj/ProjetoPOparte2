package br.com.domain;

public class Estagiário extends Funcionario {

    private int horasTrabalhadas;
    private double valorHoraTrabalhada;

    public Estagiário (String nome,
                       String matricula,
                       double valorHoraTrabalhada) {

        super(nome, matricula);
        this.valorHoraTrabalhada = valorHoraTrabalhada;
        this.horasTrabalhadas = 0;
    }


        public void registrarHoras (int horasTrabalhadas) {
            this.valorHoraTrabalhada = valorHoraTrabalhada;
        }


        @Override
        public double calcularSalario() {
        return horasTrabalhadas * valorHoraTrabalhada;
        }
























}
