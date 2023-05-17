package Granjita;

public class Vaca extends Granja {

  Vaca(){
    super("vaca de manchas blancas y negras", 50, "prado", 4);   
  }

  public void comida(){
    System.out.println("La vaca da deliciosa leche!!");
  }

  @Override
  public void info(){
    System.out.println("Este animal es una " + especie + ", hay " + cantidad + " de su especie" + " vive en el " + lugar + " y tiene " + age + " años"); 
  }

   public void sonido(){
    System.out.println("muuuu"); 
  }  
}
