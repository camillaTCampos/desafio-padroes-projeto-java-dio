
public class AcaiComLeiteCondensado extends AcaiDecorator {

	public AcaiComLeiteCondensado(Acai acai) {
		super(acai);
	}
	
	@Override
	public double informarPreco() {
		return super.informarPreco() + 3.0;
	}
	@Override
	public String informarIngredientes() {
		return super.informarIngredientes() + ", com adição de Leite Condensado.";
	}
}
