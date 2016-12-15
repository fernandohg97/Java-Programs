import java.util.Scanner;
class prog2
{
  public static void main (String[]arg)
  {
    int m,c,i=0;
    int candidatos[] = new int[12];
    Scanner input = new Scanner (System.in);
    System.out.println("Existen 12 candidatos en las elecciones.");

    System.out.print("Ingresa tu voto (Escribe -1 para salir): ");
    c = input.nextInt();
      while (c!=-1)
      {
        candidatos[c-1] = candidatos[c-1]+1;
        System.out.print("Ingresa tu voto (Escribe -1 para salir): ");
        c = input.nextInt();

      }
      for (int x=0;x<=candidatos.length - 1;x++)
      {
        System.out.print("Candidato "+(x+1)+": ");
        System.out.println(candidatos[x]+" voto");
      }



  }
}
