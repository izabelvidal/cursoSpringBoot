package com.izabelvidal.cursoMC.domain;

import java.util.Date;

import com.izabelvidal.cursoMC.domain.enums.EstadoPagamento;

public class PagamentoComBoleto extends Pagamento{
	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {}

	public PagamentoComBoleto(Integer idInteger, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(idInteger, estado, pedido);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}
}
