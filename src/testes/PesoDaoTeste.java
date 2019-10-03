package testes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import dao.PesoDAO;
import entities.Peso;

public class PesoDaoTeste {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("pt", "BR"));
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		PesoDAO pesoDao = new PesoDAO();
		
		List<Peso> pesos = new ArrayList<>();
		
		
		for (int i = 0; i < 10; i++){
			System.out.println();
			System.out.printf("Digite o valor do peso em kg da medi��o %s: ", i + 1);
			double peso = sc.nextDouble();
			LocalDateTime data = LocalDateTime.now();
			pesos.add(new Peso(peso, data));
		}
		
		pesoDao.getAll(pesos);
		
		
		
		sc.close();
	}

}
