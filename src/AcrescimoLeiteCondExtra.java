public class AcrescimoLeiteCondExtra extends Extra{

	public AcrescimoLeiteCondExtra(String label, double preco, Pedido pedido) {
		super(label, preco, pedido);
		// TODO Auto-generated constructor stub
	}

	public double getPreco() {
		return(this.preco*2)+pedido.getPreco();
		
	}
	public String getLabel() {
		return pedido.getLabel()+" "+this.label;
	}
}