
public class TestaBanco {

	public static void main(String[] args) {
		Cliente thay = new Cliente();
		thay.nome = "Thayane Lopes";
		thay.cpf = "235.145.362-58";
		thay.profissao = "analista de sistemas";
		
		Conta contaDaThay = new Conta();
		contaDaThay.deposito(100);
		
		contaDaThay.titular = thay;
		System.out.println(contaDaThay.titular.nome);
		System.out.println(contaDaThay.titular);
		System.out.println();
	}
}
