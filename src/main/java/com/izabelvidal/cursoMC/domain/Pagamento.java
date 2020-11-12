package com.izabelvidal.cursoMC.domain;

import com.izabelvidal.cursoMC.domain.enums.EstadoPagamento;

public class Pagamento {
	private Integer idInteger;
	private EstadoPagamento estado;
	
	private Pedido pedido;
	
	public Pagamento() {}

	public Pagamento(Integer idInteger, EstadoPagamento estado, Pedido pedido) {
		super();
		this.idInteger = idInteger;
		this.estado = estado;
		this.pedido = pedido;
	}
}
