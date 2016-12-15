/* Supóngase que en una reciente elección hubo cuatro candidatos (con identificadores 1, 2, 3, 4).
usted habrá de encontrar, mediante un programa, el número de votos correspondientes a cada candidato y el porcentaje
que obtuvo respecto al total de votantes. el usuario tecleará los votos de manera desorganizada, tal y como se
obtuvieron en la elección, el final de datos está representado por un cero.
Observe , como ejemplo la siguiente lista: 1 3 1 4 2 2 1 4 1 1 1 2 1 3 1 4 0 Donde 1 representa un voto para candidato 1,
3 un voto para candidato 3 y así sucesivamente
*/
import java.util.Scanner;
class prog2
{
    public static void main(String[] args)
    {
      double prom1, prom2, prom3, prom4, numVotos;
      int cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0, votos;
      Scanner input = new Scanner(System.in);

      System.out.print("Ingresa el voto para cada candidato: (Escribe 0 para terminar.)");
      votos = input.nextInt();

      while (votos>=1)
      {
        switch (votos)
        {
        case 1:
          cand1++;
        break;
        case 2:
          cand2++;
        break;
        case 3:
          cand3++;
          break;
        case 4:
          cand4++;
        break;
        default:
        System.out.println("No existe este candidato");
        }
        System.out.print("Ingresa el voto para cada candidato: (Escribe 0 para terminar.)");
        votos = input.nextInt();
      }
      numVotos = cand1 + cand2 +cand3 +cand4;
      prom1 = cand1/numVotos*100;
      System.out.printf("El porcentaje del candidato 1 es de %.2f\n",prom1);
      prom2 = cand2/numVotos*100;
      System.out.printf("El porcentaje del candidato 2 es de %.2f%\n",prom2);
      prom3 = cand3/numVotos*100;
      System.out.printf("El porcentaje del candidato 3 es de %.2f%\n",prom3);
      prom4 = cand4/numVotos*100;
      System.out.printf("El porcentaje del candidato 4 es de %.2f%\n",prom4);

      System.out.println("\n\nEl numero de votos para el candidato 1 es "+cand1);
      System.out.println("El numero de votos para el candidato 2 es "+cand2);
      System.out.println("El numero de votos para el candidato 3 es "+cand3);
      System.out.println("El numero de votos para el candidato 4 es "+cand4);

    }
}
