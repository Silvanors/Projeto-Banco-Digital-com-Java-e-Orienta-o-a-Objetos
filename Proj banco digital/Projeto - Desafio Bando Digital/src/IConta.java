
public interface IConta {
		//Uma interface é uma classe abstrata com todos os métodos abstratos. Assim, obriga
		//todas as classes que implementar a interface vai ter que implementar tudo que
		//ela tem.
		//Não há corpo já é pública, não tem sentido ser private.
		//Desse modo, fica instituído o contrato com a assinatura de métodos que terá
		//que ser respeitado. 
		void sacar(double valor);
		
		void depositar(double valor );
		
		void transferir(double valor, Conta contaDestino);
		
		void imprimirExtrato();
		
		//Eepois de definida a assinatura dos métodos deve-se implementar a interface nas 
		//classes que usará a interface.
}
