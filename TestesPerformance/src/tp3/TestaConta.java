package tp3;

public class TestaConta {
	
	public static void main(String [] args) {
		
		Conta conta = new Conta();
		conta.titular = "Jarlene";
		conta.agencia = "1234";
		conta.saldo = 1000;
		conta.dataAbertura = "06/09/2026";
		
		System.out.println("Saldo inicial: " + conta.saldo);
		
		conta.saca(300);
		System.out.println("Saldo após o saque: " + conta.saldo);
		
		conta.deposita(100);
		System.out.println("Saldo após o depósito: " + conta.saldo);

		System.out.println("Rendimento:" + conta.calculaRendimento());
		
	}
	


}
