import modelos.Conta;

public class Banco {
    public static void main(String[] args) {
        Conta a =  new Conta("Conta 1");
        System.out.println(a.toString());
        a.depositar(1000);
        System.out.println(a.toString());
        a.sacar(120);
        System.out.println(a.toString());
    }
}