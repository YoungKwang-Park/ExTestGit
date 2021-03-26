package com.lec.sts19_rest.ticket;

// MyBatis 가 매핑할 객체
public interface TicketDAO {
	int insertCard(String userId, int buyAmount);
	int insertTicket(String userId, int ticketCount);
}
