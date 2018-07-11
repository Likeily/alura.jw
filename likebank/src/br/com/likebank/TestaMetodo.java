package br.com.likebank;

public class TestaMetodo {

		public static void main(String[] args) {
			Conta conta = new Conta(123,456);
			conta.getSaldo();
			conta.deposito(50);
			System.out.println(conta.getSaldo());
			boolean conseguiuRetirar = conta.saque(20);
			System.out.println(conta.getSaldo());
			System.out.println(conseguiuRetirar);
			
			Conta contaDaThay = new Conta();
			contaDaThay.deposito(1000);
			
		}
		}
