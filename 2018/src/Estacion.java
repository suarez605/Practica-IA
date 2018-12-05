import java.util.ArrayList;

public class Estacion{

  private String nombre;
  private ArrayList<Estacion> estaciones;
  private ArrayList<Integer> lineas;
  
  public Estacion(String nombre, ArrayList<Estacion> estaciones, ArrayList<Integer> lineas){
    this.nombre=nombre;
    this.estaciones=estaciones;
    this.lineas=lineas;
  }
  
  public Estacion(String nombre, Estacion est1, Estacion est2, Estacion est3, Estacion est4, int lin1, int lin2){
    this.nombre=nombre;
    estaciones=new ArrayList<Estacion>();
    lineas=new ArrayList<Integer>(); 
    Estacion[] aux={est1, est2, est3, est4};
    for(int i=0; i<aux.length; i++){
      if(aux[i]!=null){
        estaciones.add(aux[i]);
      }
    }
    int[] aux2={lin1, lin2};
    for(int i=0; i<aux2.length; i++){
      if(aux2[i]!=null){
        lineas.add(aux2[i]);
      }
    }
  }
  
  public String getNombre(){
    return nombre;
  }
  
  public ArrayList<Estacion> getEstaciones(){
    return estaciones;
  }
    
  public ArrayList<Integer> getLineas(){
    return lineas;
  }
  
}
