//Fa�a um programa que receba como entrada o nome do usu�rio e o ano de
//nacimento e como sa�da seu nome juntamente com sua idade e se o mesmo � maior
//ou n�o de idade. Utilize o operador tern�rio. 


package Atividade3;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		String name, result, older;
		int birthYear, age;
		int toBeOlder=18;
		int actualYear = 2021;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		name = input.nextLine();
		System.out.println("Digite seu ano de nascimento: ");
		birthYear = input.nextInt();
		age = actualYear - birthYear;
		older = (age >= toBeOlder) ? "maior de idade." : "menor de idade.";
		System.out.println("Ol� " + name + " com seus " + age + " voc� � " + older);

	}

}
