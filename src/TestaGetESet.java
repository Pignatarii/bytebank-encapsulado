public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta();
        //conta.numero = 1337;
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        //conta.titular = paulo;
        paulo.setNome("paulo silveira");

        conta.setTitular(paulo);


    }
}
