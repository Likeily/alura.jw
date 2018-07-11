

public class Conta {
	private double saldo;
	int agencia = 42;
	int numero;
	Cliente titular;
	
	
	public void deposito(double valor) {
		this.saldo += valor;	
	}
	
	public boolean saque(double valor){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transferencia(double valor, Conta destino) {
		if(this.saldo >= valor){
			this.saldo -= valor;
			destino.deposito(valor);
			return true;
		}
		return false;
		}


	public double getSaldo() {
		return this.saldo;
	}
}
