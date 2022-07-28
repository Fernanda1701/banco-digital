public class ContaCorrente extends Conta{
    protected static int SEQUENCIAL_CC = 1001;
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        super.numero = SEQUENCIAL_CC++;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
