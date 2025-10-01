package br.com.ex26setembro;

public class Desenvolvedor extends Funcionario {

    private int horasExtra;
    private Double valorHoraExtra;

    public Desenvolvedor(String nome,
                         String matricula,
                         double salarioBase,
                         int horasExtra,
                         Double valorHoraExtra) {
        super(nome, matricula, salarioBase);
        this.horasExtra = horasExtra;
        this.valorHoraExtra = valorHoraExtra;
    }

    public Double getValorHoraExtra() {
        return valorHoraExtra;
    }
    public void setValorHoraExtra(Double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }
    public int getHorasExtra() {
        return horasExtra;
    }
    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (valorHoraExtra * horasExtra);
    }

    public void registrarHoraExtra(int horasExtra) {
        this.horasExtra += horasExtra;
    }


}