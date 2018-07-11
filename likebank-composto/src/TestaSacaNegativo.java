
public class TestaSacaNegativo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposito(100);
				
		conta.saque(101);
		
		System.out.println(conta.getSaldo());
	}
}
