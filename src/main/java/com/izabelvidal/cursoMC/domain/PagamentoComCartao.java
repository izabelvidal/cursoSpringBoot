package com.izabelvidal.cursoMC.domain;

import java.io.Serializable;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.izabelvidal.cursoMC.domain.enums.EstadoPagamento;

@Entity
@JsonTypeName("pagamentoComCartao")
public class PagamentoComCartao extends Pagamento implements Serializable{
	private static final long serialVersionUID = 1L;
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
