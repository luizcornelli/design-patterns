
public class CalculadorDeImpostos {

	public void realizarCalculo(Orcamento orcamento, Imposto impostoQualquer) {

		double icms = impostoQualquer.calcula(orcamento);
		System.out.println(icms);
	}
}
