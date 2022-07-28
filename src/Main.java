public class Main {
    public static void main(String[] args) {
        Cliente fernanda = new Cliente();
        fernanda.setNome("Fernanda");

        Conta cc = new ContaCorrente(fernanda);
        Conta poupanca = new ContaPoupanca(fernanda);

        cc.depositar(15000);
        cc.transferir(200, poupanca, fernanda);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();



        Cliente joao = new Cliente();
        joao.setNome("João");

        poupanca = new ContaPoupanca(joao);

        poupanca.depositar(5000);
        poupanca.imprimirExtrato();



        Cliente ana = new Cliente();
        ana.setNome("Ana");

        cc = new ContaCorrente(ana);

        cc.depositar(200);
        cc.imprimirExtrato();
    }
}
