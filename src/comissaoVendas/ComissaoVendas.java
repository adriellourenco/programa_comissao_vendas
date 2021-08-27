package comissaoVendas;

import java.util.Scanner;

public class ComissaoVendas {

	public static void main(String[] args) {
		
		String nomeVendedor;
		double tempoTrabalho;
		double valorVendas;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("**********COMISS�O SOBRE VENDAS**********");
		System.out.println();
		
		System.out.println("Qual � o seu Nome do Vendedor?");
		nomeVendedor = leitor.next();
		
		System.out.println("Qual � o seu Tempo de Trabalho na Loja em Anos?");
		tempoTrabalho = leitor.nextDouble();
		
		System.out.println("Qual � o Valor Total das suas Vendas? (USE PONTO PARA SEPARAR A CASA DE MILHAR E A V�RGULA PARA SEPARAR OS CENTAVOS!)");
		valorVendas = leitor.nextDouble();
		
		leitor.close();
		
		System.out.println();
		System.out.println("**********COMISS�O SOBRE VENDAS**********");
		System.out.println();
		
		if (tempoTrabalho>=1 && valorVendas>10000 && valorVendas<20000) {
			System.out.println("Nome do Vendedor: " +nomeVendedor);
			System.out.println("Valor das Vendas: " +valorVendas);
			System.out.println("Comiss�o sobre as Vendas: 5%");
			System.out.println("Valor da Comiss�o: " +valorVendas*0.05);
		}
		
		else if (tempoTrabalho>=1 && valorVendas>=20000) {
			System.out.println("Nome do Vendedor: " +nomeVendedor);
			System.out.println("Valor das Vendas: " +valorVendas);
			System.out.println("Comiss�o sobre as Vendas: 10%");
			System.out.println("Valor da Comiss�o: " +valorVendas*0.1);
		}
		
		else {
			System.out.println("Nome do Vendedor: " +nomeVendedor);
			System.out.println("Valor das Vendas: " +valorVendas);
			System.out.println("Comiss�o sobre as Vendas: 3%");
			System.out.println("Valor da Comiss�o: " +valorVendas*0.03);
		}

	}

}
