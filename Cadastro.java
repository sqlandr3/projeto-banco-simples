package Cadastro;

public class Cadastro {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("André", 18, 140f, 12345678l);
        System.out.println(pessoa.getNome());
    }
}