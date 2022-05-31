
public class Main {

	
	public static void main(String[]args) {
		
		Acai conta = new AcaiSimples();
		imprimirConta(conta);
		
		conta = new AcaiComLeiteCondensado(conta);
		imprimirConta(conta);
		
		conta = new AcaiSimples();
		conta = new AcaiComSorvete(conta);
		imprimirConta(conta);
		
		}

	private static void imprimirConta(Acai conta) {
		
		System.out.println("Valor Total: $" + conta.informarPreco() + "\nIngredientes: " + conta.informarIngredientes());
		
	}
}
