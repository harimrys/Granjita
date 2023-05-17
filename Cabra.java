package Granjita;

public class Cabra extends Granja {

  Cabra(){
    super("cabra", 20, "montaña", 2);
  }

  @Override
  public void info(){
    System.out.println("Este animal es una " + especie + ", hay " + cantidad + " de su especie" + " vive en la " + lugar + " y tiene " + age + " años");
  
  }
}
