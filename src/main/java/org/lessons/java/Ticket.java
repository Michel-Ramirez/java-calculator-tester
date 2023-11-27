package org.lessons.java;

public class Ticket {

	private int age;
	private int km;

	private static double TICKET_PRICE = 0.21;

	private static double underDiscount = 0.2;
	private static double overDiscont = 0.4;

	public Ticket(int age, int km) {
		setAge(age);
		setKm(km);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		if (age <= 0) {
			throw new IllegalArgumentException("Età non valida");
		}

		this.age = age;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {

		if (km <= 0) {
			throw new IllegalArgumentException("km non validi");
		}

		this.km = km;
	}

}
