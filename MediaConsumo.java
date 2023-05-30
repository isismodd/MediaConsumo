package listaExercicio_Controles;

import java.util.Scanner;

public class MediaConsumo{
	public static void main (String[] args) {
	  int quilometros = 0;
	  int litros = 0;
	  int consumo = 0;
	  int totalkm = 0;
	  int contador = 1;
  	  double media = 0;
	 
	  Scanner entrada = new Scanner(System.in);{

	  while (quilometros != -1) {

	 	 totalkm = totalkm + quilometros;

	 	 consumo = consumo + litros;

	 	 media = (double) quilometros / litros;

	 	 System.out.println("Quilômetros rodados: ");
	 	 quilometros = entrada.nextInt();

	 	 System.out.println("Consumo de combustível: ");
	 	 litros = entrada.nextInt();

	 	 if (quilometros > 0)
	         
	 	 System.out.printf("Media do carro %d: %.2f Km/Litro\n", contador++, 
	 		 (double) quilometros / litros); 
	 	 System.out.printf("\nTotal de quilômetros rodados: %d\n", totalkm);
	 	 System.out.printf("\nTotal de combustível gasto: %d\n", consumo);
	 	 System.out.printf("Quilômetros por litro: %.2f\n", media);
}
	  }
	 }
}
