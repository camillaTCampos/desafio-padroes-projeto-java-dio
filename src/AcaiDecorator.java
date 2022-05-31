
public abstract class AcaiDecorator implements Acai {
	private final Acai acaiDecorator ;
	
	public AcaiDecorator(Acai acai) {
		this.acaiDecorator = acai;
	}
	
	@Override
	public double informarPreco() {
		return acaiDecorator.informarPreco();
	}
	@Override
	public String informarIngredientes() {
		return acaiDecorator.informarIngredientes();
	}
	public Acai getacai() {
		return acaiDecorator;
	}
}
