//para uma classe filha herdar da classe pai usa-se o "extends" mais o nome.
//Assim o antigo código da classe filha não será usado. 

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInformacoesComuns();
	}

	/*
	 * private static int SEQUENCIAL = 1;
	 * 
	 * public ContaPoupanca() { super.agencia = AGENCIA_PADRAO; super.numero =
	 * SEQUENCIAL++;
	 */
	
	/*
	 * private int agencia; private int numero; private double saldo;
	 * 
	 * public void sacar() {
	 * 
	 * }
	 * 
	 * public void depositar( ) {
	 * 
	 * }
	 * 
	 * public void transferir() {
	 * 
	 * }
	 */
}

