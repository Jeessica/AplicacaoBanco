package br.ufpe.cin.banco;

public class RenderJurosPoupancaException extends Exception {

	public RenderJurosPoupancaException () {
		super("Erro ao render juros, o número informado não é de uma Poupança");
	}
}
