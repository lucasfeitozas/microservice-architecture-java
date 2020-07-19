package com.mercadao.ticketservice.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "TICKETS")
@Entity
public class Ticket implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "TICKETID")
	private Integer ticketId;

	@Column(name = "NUMEROPREMIADO")
	private Integer numeroPremiado;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "PRODUTOID")
	private Integer produtoId;

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public Integer getNumeroPremiado() {
		return numeroPremiado;
	}

	public void setNumeroPremiado(Integer numeroPremiado) {
		this.numeroPremiado = numeroPremiado;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Integer produtoId) {
		this.produtoId = produtoId;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", numeroPremiado=" + numeroPremiado + ", status=" + status
				+ ", produtoId=" + produtoId + "]";
	}

}
