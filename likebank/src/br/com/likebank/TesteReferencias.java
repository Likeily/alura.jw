package br.com.likebank;

public class TesteReferencias { 
	
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); 
        primeiraConta.getSaldo();

        System.out.println("saldo da primeira: " + primeiraConta.getSaldo());

        Conta segundaConta = primeiraConta;

        System.out.println("saldo da segunda conta: " + segundaConta.getSaldo());

        segundaConta.getSaldo();
        System.out.println("saldo da segunda conta " + segundaConta.getSaldo()); 

        System.out.println(primeiraConta.getSaldo());

        if(primeiraConta == segundaConta) {
            System.out.println("é a mesma conta");                
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);                            
    }
}