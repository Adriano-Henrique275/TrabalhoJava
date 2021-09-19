public class Conta implements Transacao {
    private Integer numeroConta;
    Banco banco;

    public Conta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Override
    public double compraVista() {        
        return 0;
    }

    @Override
    public double compraParcelada() {
        return 0;
    }

    @Override
    public double pagamento() {
        return 0;
    }

    @Override
    public double saque() {
        return 0;
    }
}
