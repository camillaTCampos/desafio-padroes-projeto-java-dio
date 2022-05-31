 public class AcrescimoLeiteCondensado extends Extra {

	public AcrescimoLeiteCondensado(String label, double preco, Pedido pedido) {
		super(label, preco, pedido);
		// TODO Auto-generated constructor stub
	}

	public double getPreco() {
		// TODO Auto-generated method stub
		return this.preco+pedido.getPreco();
	}
}