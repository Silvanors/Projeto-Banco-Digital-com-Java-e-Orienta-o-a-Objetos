//Usa-se o "implements" mais no nome da interface para implementar na classe.
//Neste caso, a classe "Conta" é obrigada a implementar os métodos abstratos
//da classe "IConta".
//Usa-se o "abstract" para que ninguém instancie, garante que ninguém use o new senão
//as classes filhas "ContaCorrente" e "ContaPoupança".


public abstract class Conta implements IConta {
	
	protected static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
	
		//saldo = saldo - valor; ou
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		
		//saldo = saldo + valor; ou
				saldo += valor;

		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	protected void imprimirInformacoesComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %2f", this.saldo));
	}
	

	
	
	

}
