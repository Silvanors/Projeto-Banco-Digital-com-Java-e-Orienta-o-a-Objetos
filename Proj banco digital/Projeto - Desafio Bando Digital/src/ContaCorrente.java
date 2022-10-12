

//para uma classe filha herdar da classe pai usa-se o "extends" mais o nome.
//Assim o antigo código da classe filha não será usado. 

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInformacoesComuns();
	}
	
	/*
	 * private static int SEQUENCIAL = 1;
	 * 
	 * public ContaCorrente() { super.agencia = ; super.numero = SEQUENCIAL++; }
	 */
	
	/*
	 * private int agencia; private int numero; private double saldo;
	 * 
	 * public void sacar() {
	 * 
	 * }
	 * 
	 * public int getAgencia() { return agencia; }
	 * 
	 * public int getNumero() { return numero; }
	 * 
	 * public double getSaldo() { return saldo; }
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

