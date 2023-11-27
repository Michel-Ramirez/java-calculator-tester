package org.lesson.java;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.lessons.java.Ticket;

public class TicketTest {

	@Test
	public void testTicketKmNegative() {

		int km = -1;
		int age = 50;

		assertThrows(Exception.class, () -> {
			Ticket t = new Ticket(age, km);
		}, "Non puoi inserire valori negativi");

	}

	@Test
	public void testTicketAgeNegative() {

		int km = 5;
		int age = -60;

		assertThrows(Exception.class, () -> {
			Ticket t = new Ticket(age, km);
		}, "Non puoi inserire valori negativi");

	}

	@Test
	public void testTicketAgeKmNegative() {

		int km = -5;
		int age = -60;

		assertThrows(Exception.class, () -> {
			Ticket t = new Ticket(age, km);
		}, "Non puoi inserire valori negativi in età e km");

	}

}
