public class Estacion{

  private int numeroEstaciones;
  private Estacion[] estaciones;
  private int linea;
  
  public Estacion(int numeroEstaciones, Estacion[] estaciones, int linea){
    this.numeroEstaciones=numeroEstaciones;
    this.estaciones=estaciones;
    this.linea=linea;
  }
  
  public Estacion(Estacion est1, Estacion est2, Estacion est3, Estacion est4, int linea){
    numeroEstaciones=0;
    aux={est1, est2, est3, est4};
    for(int i=0; i<aux.length; i++){
      if(aux[i]!=null){
        numeroEstaciones++;
      }
    }
    estaciones=new Estacion[numeroEstaciones];
    cont=0;
    for(int i=0; i<aux.length; i++){
      if(aux[i]!=null){
        estaciones[cont]=aux[i];
        cont++;
      }
    }
    this.linea=linea;
  }
  
  public int getNumeroEstaciones(){
    return numeroEstaciones;
  }
  
  public Estacion getEstaciones(){
    return estaciones;
  }
  
  public int getLinea(){
    return linea;
  }
  
}
