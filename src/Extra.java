
public abstract class Extra implements Pedido {
	
	protected Pedido pedido;
	protected String label;
	protected double preco;
	
	public Extra(String label, double preco, Pedido pedido) {
		
		this.label = label;
		this.preco = preco;		
		this.pedido = pedido;
	}
	// O pre�o � delegado para implementa��o concreta
	public abstract double getPreco();
	
	// Label default � fornecido
	public String getLabel() {
		return pedido.getLabel()+", "+this.label;
	}
	
}
