
public class AcaiComSorvete extends AcaiDecorator {

	public AcaiComSorvete(Acai acai) {
		super(acai);
	}
	@Override
	public double informarPreco() {
		return super.informarPreco() + 8.0;
	}
	@Override
	public String informarIngredientes() {
		return super.informarIngredientes() + ", com adi��o de sorvete de Creme.";
	}
}
