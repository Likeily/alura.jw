package br.com.likebank;

public class Conta {
	private double saldo;
	private int agencia = 404;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	
	public Conta(int agencia, int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("Estou criando uma conta");
	}
	public double getSaldo() {
		return saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
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
	
	public Conta() {
		System.out.println("Criando uma conta");
	}
	
	public static int getTotal() {
		return total;
	}
	
	}

