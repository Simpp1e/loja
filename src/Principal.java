
import java.util.Scanner;


public class Principal 
{
  public static void main (String [] args) 
    {
      Carro carro = new Carro (); 
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Nome do carro: ");
      carro.nome= scan.next();
      System.out.print("Marca do carro: ");
      carro.marca= scan.next();   
      System.out.print("Cor do carro: ");
      carro.cor= scan.next();      
      System.out.print("Fabricacao do carro: ");
      carro.fabricacao= scan.next();      
      System.out.print("Largura do carro: ");
      carro.largura= scan.next();         
      System.out.print("Peso do carro: ");
      carro.peso= scan.next();
      
      System.out.print("\n");
          
      System.out.println("Nome do carro é: " + carro.nome);
      System.out.println("Marca do carro é: " + carro.marca);
      System.out.println("Cor do carro é: " + carro.cor);
      System.out.println("Fabricacao do carro é: " + carro.fabricacao);
      System.out.println("Largura do carro é: " + carro.largura);
      System.out.println("Peso do carro é: " + carro.peso);
      
      Carro carro1 = new Carro ();
      
      System.out.print("Nome do carro: ");
      carro1.nome= scan.next();
      System.out.print("Marca do carro: ");
      carro1.marca= scan.next();   
      System.out.print("Cor do carro: ");
      carro1.cor= scan.next();      
      System.out.print("Fabricacao do carro: ");
      carro1.fabricacao= scan.next();      
      System.out.print("Largura do carro: ");
      carro1.largura= scan.next();         
      System.out.print("Peso do carro: ");
      carro1.peso= scan.next();
      
      System.out.print("\n");
          
      System.out.println("Nome do carro é: " + carro1.nome);
      System.out.println("Marca do carro é: " + carro1.marca);
      System.out.println("Cor do carro é: " + carro1.cor);
      System.out.println("Fabricacao do carro é: " + carro1.fabricacao);
      System.out.println("Largura do carro é: " + carro1.largura);
      System.out.println("Peso do carro é: " + carro1.peso);
    }
}
