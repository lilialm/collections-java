package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListColors {

	public static void main(String[] args) {
		 ArrayList<String> cores = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite 5 cores:");

	        for (int i = 0; i < 5; i++) {
	            String cor = scanner.nextLine();
	            cores.add(cor);
	        }

	        System.out.println("Listar todas as cores:");

	        for (String cor : cores) {
	            System.out.println(cor);
	        }

	        System.out.println("Ordenar as cores:");

	        Collections.sort(cores);

	        for (String cor : cores) {
	            System.out.println(cor);
	        }
	        scanner.close();

	}

}
