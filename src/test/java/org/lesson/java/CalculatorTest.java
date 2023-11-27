package org.lesson.java;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.lessons.java.Calculator;

public class CalculatorTest {

	// ISTANZIAMO IN MODO GENERICO L'OGGETTO A NULL
	private Calculator cl = new Calculator();

//	@BeforeEach
//	public void init() throws Exception {

//
//		cl.add(5, 5);
//		cl.subtract(20, 10);
//		cl.divide(5, 5);
//		cl.multiply(5, 5);
//
//	}

	@Test
	public void calculatorAdd() throws Exception {

		float numb1 = 5;
		float numb2 = 5;

		assertDoesNotThrow(() -> cl.add(numb1, numb2), "Nessuna eccezione");
	}

	@Test
	public void calculatorSubtract() throws Exception {

		float numb1 = 5;
		float numb2 = 5;

		assertDoesNotThrow(() -> cl.add(numb1, numb2), "Nessuna eccezione");

	}

	@Test
	public void calculatorTestDivided() throws Exception {

		float numb1 = 5;
		float numb2 = 5;

		assertDoesNotThrow(() -> cl.add(numb1, numb2), "Nessuna eccezione");

	}

	@Test
	public void dividepZero() {

		float numb1 = 5;
		float numb2 = 0;

		assertThrows(Exception.class, () -> cl.divide(numb1, numb2), "Non puoi dividere un numero per 0");

	}

	@Test
	public void calculatorMultiply() {

		float numb1 = 5;
		float numb2 = 5;

		assertDoesNotThrow(() -> cl.add(numb1, numb2), "Nessuna eccezione");

	}

}
