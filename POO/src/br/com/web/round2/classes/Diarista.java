package br.com.web.round2.classes;

public class Diarista {

    public String nome;
    public String telefone;
    public String endereco;

    public void atender(String nomeCliente) {
        System.out.println("Realizando atendimento para o cliente " + nomeCliente);
    }

}
