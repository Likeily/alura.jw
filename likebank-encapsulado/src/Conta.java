

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		total++;
		System.out.println("O total da contas é: " + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.numero);
	}
	
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
	
	public int getNumero() {
		if(numero <= 0) {
			System.out.println("Erro! Não pode valor menor ou igual a 0");
		}
		return this.numero;
}
	
	public void setNumero(int numero){
	this.numero =numero;	
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return total;
	}
}

