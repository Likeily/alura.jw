package br.com.likebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); 
		primeiraConta.getSaldo();
		
		System.out.println(primeiraConta.getSaldo());
	
		primeiraConta.getSaldo();
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta();
		segundaConta.getSaldo();
		
		System.out.println("Primeira conta tem: " + primeiraConta.getSaldo());
		System.out.println("Segunda conta tem: " + segundaConta.getSaldo());
		
		System.out.println(primeiraConta.getAgencia());
		System.out.println(primeiraConta.getNumero());
		
		System.out.println(segundaConta.getAgencia());
		
		segundaConta.getAgencia();
		System.out.println("Agência da segunda conta foi alterada para: " + segundaConta.getAgencia());
		
		if(primeiraConta == segundaConta) {
			System.out.println("mesma conta");									
		}else {
			System.out.println("contas diferentes");
		
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
