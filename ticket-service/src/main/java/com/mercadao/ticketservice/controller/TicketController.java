package com.mercadao.ticketservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mercadao.ticketservice.domain.Ticket;
import com.mercadao.ticketservice.repository.TicketRepository;

@RestController
public class TicketController {

	@Autowired
	private TicketRepository ticketRepository;

	@GetMapping(value = "/ticket")
	public Iterable<Ticket> all() {
		return ticketRepository.findAll();
	}
	
	@RequestMapping(value="/ticket/{numeroticket}", method= RequestMethod.GET)
	public Ticket findByTicketId(@PathVariable Integer numeroticket) {
		return ticketRepository.findTicketByNumeroPremiado(numeroticket);
	}
	
	@GetMapping(value="/ticket/produto/{produtoId}")
	public Ticket findByTicketProduto(@PathVariable Integer produtoId) {
		
		return ticketRepository.findAllByProdutoId(produtoId);
	}
}
