package loja;

public class Vendedor {
	
	private String nome;
	private String email;
	private double faturamento;
	private int notafiscal;
	

	public void realizarVenda() {
		//vendedor responsavel pela venda, nesse metodo o valor faturado pela venda será salvo no banco de dados
	}
	
	public void calcularComissão(){
		//dependendo da venda, esse valor de comissão será salvo no banco de dados. Será uma porcentagem do faturamento e descontado.
	}
	public int emitirNotaFiscal() {
		return notafiscal;
		//a nota fiscal será emitida quando finalizada a venda pelo vendedor
		
	}
}
