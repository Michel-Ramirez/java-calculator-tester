package org.lessons.java;

public class Calculator {

	private float numb1;
	private float numb2;

	// METHODS

	// SOMMA
	public float add(float numb1, float numb2) {

		float result = numb1 + numb2;

		return result;

	}

	// SOTTRAZIONE
	public float subtract(float numb1, float numb2) {

		float result = numb1 - numb2;

		return result;

	}

	// DIVISO
	public float divide(float numb1, float numb2) throws Exception {

		if (numb2 == 0) {
			throw new IllegalArgumentException("Impossibile dividere per zero");
		}

		float result = numb1 / numb2;
		return result;

	}

	// MOLTIPLICAZIONE

	public float multiply(float numb1, float numb2) {

		float result = (numb1 * numb2);

		return result;

	}

}
