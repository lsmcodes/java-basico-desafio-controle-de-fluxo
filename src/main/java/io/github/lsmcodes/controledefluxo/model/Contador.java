package io.github.lsmcodes.controledefluxo.model;

import java.util.InputMismatchException;
import java.util.Scanner;

import io.github.lsmcodes.controledefluxo.exception.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);

		try {
			System.out.println("\nDigite o primeiro parâmetro:");
			int parametroUm = terminal.nextInt();

			System.out.println("\nDigite o segundo parâmetro:");
			int parametroDois = terminal.nextInt();

			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		} catch (InputMismatchException exception) {
			System.out.println("Os parâmetros devem ser numéricos.");
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

		if (parametroDois <= parametroUm) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
		}

		System.out.println("\nContando:");
		for (int i = parametroUm; i <= parametroDois; i++) {
			System.out.println(i);
		}

	}

}