package br.ufpe.cin.banco;

public class RenderJurosPoupancaException extends Exception {

	public RenderJurosPoupancaException () {
		super("Erro ao render juros, o n�mero informado n�o � de uma Poupan�a");
	}
}
