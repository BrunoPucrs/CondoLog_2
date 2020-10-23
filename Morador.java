package CondoLog_2;

public class Morador {
    private String nome;
    private String cpf;
    private int numeroApartamento;

    Morador(String nome, String cpf, int numeroApartamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroApartamento = numeroApartamento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    public void mostrarMorador() {
        System.out.println("Nome: " + nome + ", Cpf: " + cpf + ", Apartamento: " + numeroApartamento);
    }  
}
