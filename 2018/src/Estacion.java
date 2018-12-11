import java.util.ArrayList;

public class Estacion{

  private String nombre;
  private ArrayList<Estacion> estaciones;
  private int linea;
  
  public Estacion(String nombre, ArrayList<Estacion> estaciones, int linea){
    this.nombre=nombre;
    this.estaciones=estaciones;
    this.linea=linea;
  }
  
  public Estacion(String nombre, Estacion est1, Estacion est2, Estacion est3, int linea){
    this.nombre=nombre;
    estaciones=new ArrayList<Estacion>();
    Estacion[] aux={est1, est2, est3};
    for(int i=0; i<aux.length; i++){
      if(aux[i]!=null){
        estaciones.add(aux[i]);
      }
    }
    this.linea=linea;
  }
  
  public String getNombre(){
    return nombre;
  }
  
  public ArrayList<Estacion> getEstaciones(){
    return estaciones;
  }
    
  public int getLinea(){
    return linea;
  }
  
}
