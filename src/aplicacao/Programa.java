package aplicacao;

import java.util.Scanner;

import entidades.Triangulo;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		System.out.println("Informe a dimensão dos três lados do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Informe a dimensão dos três lados do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		System.out.printf("Área do triângulo X = %.4f%n", areaX);
		System.out.printf("Área do triângulo Y = %.4f%n", areaY);
		if (areaX > areaY) {
			System.out.println("Maior área = Triângulo X");
		} 
		else {
			System.out.println("Maior área = Triângulo Y");
		}
		sc.close();
	}
}