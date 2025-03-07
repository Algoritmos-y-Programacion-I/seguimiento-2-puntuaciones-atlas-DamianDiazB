// Análisis (completar)
// Descripción del programa:
// Entradas:
// Salidas:
// Ejemplo:

package ui;
import java.util.Scanner;

public class AtlasPuntuaciones {

	private Scanner escaner;

	private AtlasPuntuaciones() {
		escaner = new Scanner(System.in);
	}
	
	public void run(){
		// Declaracion de todas las variables a usar en el programa
		int CantRondas, NumParticipantes, NumRondas;		

		// Notificacion al usuario de la solicitud de dato
		System.out.println("¿Cuantos participantes van a jugar? (Max 10)");
		NumParticipantes = escaner.nextInt();
		int[] PuntParticipantes = new int[NumParticipantes];
		escaner.nextLine();

		System.out.println("¿Cuantas rondas van a jugar? (Max 5)");
		NumRondas = escaner.nextInt();
		escaner.nextLine();

		for(int i = 0; i < NumParticipantes; i++) {
            for(int o = 0; o < NumRondas; o++) {
            	System.out.println("Puntaje del " + i + "  jugador en la " + o + " ronda: ");
            	PuntParticipantes[o] = escaner.nextInt();
        	}
        }

		int Total = 0;
		for(int i = 0; i < PuntParticipantes.length; i++) {
            PuntParticipantes[i] += Total;
			System.out.println("El total del jugador " + i + " es: " + Total);
    	}
		CantRondas = 0;
		double promedio = 0.0;
		for(int i = 0; i < PuntParticipantes.length; i++) {
            PuntParticipantes[i] /= CantRondas;
			System.out.println("El Promedio del jugador " + i + " es: " + promedio);

		}

		// Realizamos los cálculos delegandolos a los métodos



		// Notificación al usuario de los resultados
	
	}


	

	public static void main(String[] args) {
		AtlasPuntuaciones mainApp = new AtlasPuntuaciones();
		mainApp.run();
	}
}