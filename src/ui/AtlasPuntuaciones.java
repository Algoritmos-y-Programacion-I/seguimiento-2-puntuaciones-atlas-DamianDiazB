// Analisis (completar)
// Descripcion del programa: El programa nos pide tomar los datos para un juego de maximo 10 jugadore con un maximo de 5 rondas, este tiene que sumar los puntos 
// y luego promediarlos
// Entradas: Numero de jugadores, numero de rondas, puntaje de cada jugador en cada ronda
// Salidas: Suma total de puntajes por jugador, promedio por jugador

package ui;
import java.util.Scanner;

public class AtlasPuntuaciones {

    private Scanner escaner;

    private AtlasPuntuaciones(){
        escaner = new Scanner(System.in);
    }

    public void run(){
        // Declaracion de variables
        int numParticipantes, numRondas;

        // Solicitud de datos al usuario
        System.out.print("Cuantos participantes van a jugar? (Max 10): ");
        numParticipantes = escaner.nextInt();
        while (numParticipantes < 1 || numParticipantes > 10){
            System.out.print("Numero invalido, recuerde que es un maximo 10 jugadores: ");
            numParticipantes = escaner.nextInt();
        }

        System.out.print("Cuantas rondas van a jugar? (Max 5): ");
        numRondas = escaner.nextInt();
        while (numRondas < 1 || numRondas > 5){
            System.out.print("Numero invalido, recuerde que es un maximo de 5 rondas: ");
            numRondas = escaner.nextInt();
        }

        int[][] puntajes = new int[numParticipantes][numRondas];

        for (int i = 0; i < numParticipantes; i++){
            for (int j = 0; j < numRondas; j++){
                System.out.print("Puntaje del jugador " + (i + 1) + " en la ronda " + (j + 1) + ": ");
                puntajes[i][j] = escaner.nextInt();
            }
        }

        int[] TotalPuntajes = CalcularTotal(puntajes, numRondas);
        MostrarResultados(TotalPuntajes, numRondas);
    }

    public int[] CalcularTotal(int[][] puntajes, int numRondas){
        int[] TotalPuntajes = new int[puntajes.length];
        for (int i = 0; i < puntajes.length; i++){
            for (int j = 0; j < numRondas; j++){
                TotalPuntajes[i] += puntajes[i][j];
            }
        }
        return TotalPuntajes;
    }

    private void MostrarResultados(int[] TotalPuntajes, int numRondas){
        System.out.println("Resultados finales:");
        for (int i = 0; i < TotalPuntajes.length; i++){
            double promedio = (double) TotalPuntajes[i] / numRondas;
            System.out.println("El jugador numero " + (i + 1) + " tiene un total de " + TotalPuntajes[i] + " puntos y un promedio de " + promedio);
        }
    }

    public static void main(String[] args){
        AtlasPuntuaciones mainApp = new AtlasPuntuaciones();
        mainApp.run();
    }
}
