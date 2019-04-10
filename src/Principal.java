
public class Principal 
{
  public static void main (String [] args) 
    {
      Carro carro = new Carro (); 
      carro.nome = "Nome : Aventador";
      carro.marca = "Marca : Lamborghini";
      carro.cor = "Cor : Preto Fosco";
      carro.fabricacao = "Fabricacao : 2019";
      carro.largura = "Largura: 2.265 mm";
      carro.peso = "Peso : 1.575 Kg";
   
      System.out.println(carro.nome);
      System.out.println(carro.marca);
      System.out.println(carro.cor);
      System.out.println(carro.fabricacao);
      System.out.println(carro.largura);
      System.out.println(carro.peso);
    }
}
