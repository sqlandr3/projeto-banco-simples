package Cadastro;

public class Pessoa {

    private String nome;
    private int idade;
    private float renda;
    private long cpf;

      public Pessoa(String nome, int idade, float renda, long cpf){
         this.nome = nome;
         this.idade = idade;
         this.renda = renda;
         this.cpf = cpf;

     }
    public long getCpf() {
        return cpf;
    }

    public float getRenda() {
        return renda;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
