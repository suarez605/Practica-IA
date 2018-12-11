public class Estacion{

  private String nombre;
  private String[] estaciones;
  private int linea;
  
  public Estacion(String nombre, String[] estaciones, int linea){
    this.nombre=nombre;
    this.estaciones=estaciones;
    this.linea=linea;
  }
  
  public String getNombre(){
    return nombre;
  }
  
  public String[] getEstaciones(){
    return estaciones;
  }
    
  public int getLinea(){
    return linea;
  }
  
}
