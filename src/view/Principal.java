package view;

import controller.PagamentoController;
import model.TipoPagto;

public class Principal {

	public static void main(String[] args) {
		PagamentoController pCont = new PagamentoController();
		TipoPagto tipo = TipoPagto.PIX;
		pCont.fazerPagamento(tipo);
		
		tipo = TipoPagto.CARTAO;
		pCont.fazerPagamento(tipo);
		
		tipo = TipoPagto.DINHEIRO;
		pCont.fazerPagamento(tipo);
	}
	
}
