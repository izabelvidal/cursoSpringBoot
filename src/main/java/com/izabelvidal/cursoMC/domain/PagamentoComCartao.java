package com.izabelvidal.cursoMC.domain;

import com.izabelvidal.cursoMC.domain.enums.EstadoPagamento;

public class PagamentoComCartao extends Pagamento{
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao() {}

	public PagamentoComCartao(Integer idInteger, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(idInteger, estado, pedido);
		this.setNumeroDeParcelas(numeroDeParcelas); 
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
}
