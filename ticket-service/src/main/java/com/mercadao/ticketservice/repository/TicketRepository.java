package com.mercadao.ticketservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.mercadao.ticketservice.domain.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {

	Ticket findTicketByNumeroPremiado(Integer numeroPremiado);

	Ticket findAllByProdutoId(Integer produtoId);
}
