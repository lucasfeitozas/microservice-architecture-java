package com.mercado.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name = "PRODUTO")
@Entity
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PRODUTOID")
	private Integer produtoId;

	@Column(name = "PRODUTONAME")
	private String produtoName;

	@Transient
	private Ticket ticket;

	public Produto(Integer produtoId, String produtoName) {
		super();
		this.produtoId = produtoId;
		this.produtoName = produtoName;
	}
	public Produto() {
		super();
	}
	public Integer getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Integer produtoId) {
		this.produtoId = produtoId;
	}

	public String getProdutoName() {
		return produtoName;
	}

	public void setProdutoName(String produtoName) {
		this.produtoName = produtoName;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "Produto [produtoId=" + produtoId + ", produtoName=" + produtoName + "]";
	}

}
