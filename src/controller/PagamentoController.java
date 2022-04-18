package controller;

import javax.swing.JOptionPane;

import model.TipoPagto;

public class PagamentoController {

	public void fazerPagamento(TipoPagto tipo) {
		
		if (tipo.equals(TipoPagto.CARTAO)) {
			String cpf = JOptionPane.showInputDialog(null, "Digite o CPF do Cliente");
			String nome = JOptionPane.showInputDialog(null, "Digite o Nome do Cliente");
			String numCartao = JOptionPane.showInputDialog(null, "Digite o no. do Cartão");
			String cvvCartao = JOptionPane.showInputDialog(null, "Digite o CVV do Cartão");
			System.out.println("Pagamento processado para o cliente"+nome+" - CPF: "+cpf+" Cartão: "+numCartao+" CVV: "+cvvCartao);
		} else if (tipo.equals(TipoPagto.PIX)) {
			String chavePix = "9237459372854876512935618273652187635182736518";
			System.out.println("Pagamento por pix usando chave "+chavePix);
		} else if (tipo.equals(TipoPagto.DINHEIRO)) {
			String troco = JOptionPane.showInputDialog(null, "Troco para quanto ?");
			System.out.println("Cliente precisa de troco para "+troco);
		}
		
		
	}
	
}
