package com.frontend.domain;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.frontend.domain.enums.EstadoPagamento;

@Entity
@JsonTypeName("pagamentoCartao")
public class PagamentoCartao extends Pagamento{
	private static final long serialVersionUID = 1L;
	private Integer numeroParcelas;
	
	public PagamentoCartao() {
	}

	public PagamentoCartao(Integer id, EstadoPagamento situacao, Pedido pedido, Integer numeroParcelas) {
		super(id, situacao, pedido);
		this.numeroParcelas = numeroParcelas;
	}

	public Integer getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(Integer numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}
	
}
