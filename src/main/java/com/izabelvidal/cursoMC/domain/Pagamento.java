package com.izabelvidal.cursoMC.domain;

import com.izabelvidal.cursoMC.domain.enums.EstadoPagamento;

public class Pagamento {
	private Integer idInteger;
	private EstadoPagamento estado;
	
	private Pedido pedido;
	
	public Pagamento() {}

	public Pagamento(Integer idInteger, EstadoPagamento estado, Pedido pedido) {
		super();
		this.setIdInteger(idInteger);
		this.setEstado(estado);
		this.setPedido(pedido);
	}

	public Integer getIdInteger() {
		return idInteger;
	}

	public void setIdInteger(Integer idInteger) {
		this.idInteger = idInteger;
	}

	public EstadoPagamento getEstado() {
		return estado;
	}

	public void setEstado(EstadoPagamento estado) {
		this.estado = estado;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
}
