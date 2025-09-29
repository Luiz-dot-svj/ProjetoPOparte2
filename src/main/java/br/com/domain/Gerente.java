package br.com.domain;

public class Gerente extends Funcionario{

    Double bonusPerformace;
    double comissao;

    public Gerente (String nome,
                    String matricula,
                    double salarioBase) {
        super(nome,matricula,salarioBase);
        this.bonusPerformace = 0.0;
        this.comissao = 0.0;
    }

    public Double getBonusPerformace() {
        return bonusPerformace;
    }
    public void setBonusPerformace(Double bonusPerformace) {
        this.bonusPerformace = bonusPerformace;
    }

    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonusPerformace * comissao;
    }
}