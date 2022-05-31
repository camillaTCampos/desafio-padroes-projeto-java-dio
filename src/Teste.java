public class Teste {

	public static void main(String[] args) {
		Pedido acaiTurbinado = new Acai("Acai Turbinado",10);
		acaiTurbinado = new AcrescimoLeiteCondExtra("Leite Cond Extra",6, acaiTurbinado);
		acaiTurbinado = new GranolaSemCusto("Granola da casa :)", 10, acaiTurbinado);
		
		System.out.println(acaiTurbinado.getPreco());
		System.out.println(acaiTurbinado.getLabel());

		}
}