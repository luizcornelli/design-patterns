
public class TesteDeImpostos {

	public static void main (String [] args) {
		
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
		
		// Passando or?amento e estr?tegia para o calculo
		calculadorDeImpostos.realizarCalculo(orcamento, icms); 
		calculadorDeImpostos.realizarCalculo(orcamento, iss);
	}
}
