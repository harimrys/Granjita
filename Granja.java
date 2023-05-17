package Granjita;

public class Granja {
  protected String especie;
  protected int cantidad;
  protected String lugar; //ejemplo gallinero, cuardra..
  protected int age;


//constructor
  Granja(String especies, int cuantos, String donde, int años){
    this.especie = especies;
    this.cantidad = cuantos;
    this.lugar = donde;
    this.age = años;
  }

  //metodos
  public void sonido(String ruido){
    System.out.println(ruido); 
  }

  public void info(){
    System.out.println("Este animal es un " + especie + ", hay " + cantidad + " de su especie" + " vive en el " + lugar + " y tiene " + age + " años");
    
  }

  public static void main (String[] args){
    
    Granja gallo = new Granja("gallo", 10, "gallinero", 4);
    gallo.info(); 
    gallo.sonido("kikirikii");

    System.out.println();

    Cabra cabrita = new Cabra();
    cabrita.info();
    cabrita.sonido("meeeeee");

    System.out.println();

    Vaca vaquita = new Vaca();
    vaquita.info();
    vaquita.sonido();
    vaquita.comida();
  }
}
