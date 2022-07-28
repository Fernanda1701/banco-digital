public class ContaPoupanca extends Conta{
    protected static int SEQUENCIAL_POUPANCA = 2001;
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        super.numero = SEQUENCIAL_POUPANCA++;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
