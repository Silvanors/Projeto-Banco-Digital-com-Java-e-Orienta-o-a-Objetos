public class Main {

	public static void main(String[] args) {
		
		Cliente silvano = new Cliente();
		silvano.setNome("Silvano");
		
		Conta cc = new ContaCorrente(silvano);
		Conta poupanca = new ContaPoupanca(silvano);
		cc.depositar(100);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
}