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
  
  public Estacion(String nombre, Estacion est1, Estacion est2, Estacion est3, Estacion est4, int linea){
    this.nombre=nombre;
    estaciones=new ArrayList<Estacion>();
    Estacion[] aux={est1, est2, est3, est4};
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
    
  public int getLineas(){
    return linea;
  }
  
}
