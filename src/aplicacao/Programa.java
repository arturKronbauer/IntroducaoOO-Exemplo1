package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		System.out.println("Informe a dimensão dos três lados do triângulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Informe a dimensão dos três lados do triângulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
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