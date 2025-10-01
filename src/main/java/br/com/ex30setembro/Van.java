package br.com.ex30setembro;

import org.w3c.dom.ls.LSOutput;

public class Van extends Veiculo {
    private int numeroPortas;
    private boolean arCondicionado;
    private boolean janelaTraseira;

    public Van (String marca, String modelo, int ano, int numeroPortas, boolean arCondicionado, boolean janelaTraseira){
        super(marca, modelo, ano);

        this.numeroPortas = numeroPortas;
        this.arCondicionado = arCondicionado;
        this.janelaTraseira = janelaTraseira;
    }
    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("portas" + numeroPortas);
        System.out.println("arCondicionado" + (arCondicionado? "Sim" : "Não"));
        System.out.println("janelaTraseira" + (janelaTraseira? "Sim" : "Não"));
    }

    public void abrirPortaMalas(){
        System.out.println("Porta-malas aberto!");
    }

}
