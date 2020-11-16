package com.izabelvidal.cursoMC.domain;

import java.util.Date;

import com.izabelvidal.cursoMC.domain.enums.EstadoPagamento;

public class PagamentoComBoleto extends Pagamento{
	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {}

	public PagamentoComBoleto(Integer idInteger, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(idInteger, estado, pedido);
		this.setDataVencimento(dataVencimento);
		this.setDataPagamento(dataPagamento);
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
}
