
public class Acai implements Pedido {
	private String label;
	private double preco;
	
	public Acai(String label,double preco) {
		this.label = label;
		this.preco = preco;
	}

	public String getLabel() {
		return this.label;
	}

	public double getPreco() {
		return this.preco;
	}
}