public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;


    //deposita
    public void deposita(double valor) {
        this.saldo += valor;
    }

    //saca
    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    //transfere
    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        }
        return false;

    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }


}


