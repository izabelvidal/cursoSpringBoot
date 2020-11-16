package com.izabelvidal.cursoMC.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.izabelvidal.cursoMC.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern="dd/MM/yyy")
	private Date dataVencimento;
	
	@JsonFormat(pattern="dd/MM/yyy")
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