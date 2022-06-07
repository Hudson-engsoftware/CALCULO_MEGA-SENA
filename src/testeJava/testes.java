package testeJava;

import java.util.Random;
import java.util.Scanner;

public class testes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int acertos = 0;
		double premioT,premio = 0;
		int[] resultado = new int [6];
		int[] aposta = new int[6];
		
		System.out.println("Insira o valor do Premio da Mega Sena :");
		premioT = sc.nextInt();
		
		
		for( int a =0 ; a < aposta.length ;a++)	{
			
			System.out.println("Insira um numeros :");
			aposta[a] = sc.nextInt();
		}	
	
		for( int i = 0 ; i < resultado.length ; i++) {
			resultado[i] = aleatorio.nextInt(60);
			
			
			
		if(aposta[i] == resultado[i]) {
			
			acertos++;
			
		}
		}
		
		switch(acertos) {
	
		case 4:
			System.out.println("Voce acertou 4 numeros, Parabens voce acertou a Quadra e ganhou : " + premio + " Reais" );
			   premio = (premioT * acertos/100 );
			break;
		case 5:
			System.out.println("Voce acertou 5 numeros, Parabens voce acertou a Quina e ganhou : " + premio + " Reais" );
			premio = ( premioT * acertos/100 );
			break;
		case 6:
			System.out.println("Parabens Voce acertou 6 numeros, Parabens voce acertou a Mega e ganhou :" + premio + " Reais" );
			premio = ( premioT * acertos/100 );
			break;
		default :
			System.out.println("Voce acertou "+ acertos + " numeros, continue tentando! \n" );
			break;
			
		}
	
		System.out.print("Numeros sorteados: ");
		for (int i = 0; i < resultado.length; i++){
			System.out.print(resultado[i] + " ");
		}
		System.out.println();
		System.out.print("Numeros Apostados: ");
		for (int i = 0; i < aposta.length; i++){
			System.out.print(aposta[i] + " ");
		}
		}
		
		
			
}		
		

