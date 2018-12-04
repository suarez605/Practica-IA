public class Estacion{

  private String nombre;
  private int numeroEstaciones;
  private Estacion[] estaciones;
  private int numeroLineas;
  private int[] lineas;
  
  public Estacion(String nombre, int numeroEstaciones, Estacion[] estaciones, int numeroLineas, int[] lineas){
    this.nombre=nombre;
    this.numeroEstaciones=numeroEstaciones;
    this.estaciones=estaciones;
    this.numeroLineas=numeroLineas;
    this.lineas=lineas;
  }
  
  public Estacion(String nombre, Estacion est1, Estacion est2, Estacion est3, Estacion est4, int lin1, int lin2){
    this.nombre=nombre;
    numeroEstaciones=0;
    Estacion[] aux={est1, est2, est3, est4};
    for(int i=0; i<aux.length; i++){
      if(aux[i]!=null){
        numeroEstaciones++;
      }
    }
    estaciones=new Estacion[numeroEstaciones];
    int cont=0;
    for(int i=0; i<aux.length; i++){
      if(aux[i]!=null){
        estaciones[cont]=aux[i];
        cont++;
      }
    }
    numeroLineas=0;
    int[] aux2={lin1, lin2}
    for(int i=0; i<aux2.length; i++){
      if(aux2[i]!=null){
        numeroLineas++;
      }
      lineas=new int[numeroLineas];
      cont=0;
      for(int i=0; i<aux2.length; i++){
      if(aux2[i]!=null){
        lineas[cont]=aux2[i];
        cont++;
      }
    }
  }
  
  public String getNombre(){
    return nombre;
  }
  
  public int getNumeroEstaciones(){
    return numeroEstaciones;
  }
  
  public Estacion[] getEstaciones(){
    return estaciones;
  }
  
  public int getNumeroLineas(){
    return numeroLineas;
  }
    
  public int[] getLineas(){
    return lineas;
  }
  
}
