
public class GranolaSemCusto extends Extra {

	public GranolaSemCusto(String label, double preco, Pedido pedido) {
		super(label, preco, pedido);
		
	}

	public double getPreco() {
		return pedido.getPreco();
	}

}
