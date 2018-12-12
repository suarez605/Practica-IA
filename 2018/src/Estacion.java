public class Estacion{

  private String nombre;
  private String[] estaciones;
  private int linea;
  
  public Estacion(String nombre, String[] estaciones, int linea){
    this.nombre=nombre;
    this.estaciones=estaciones;
    this.linea=linea;
  }
  
  public Estacion(String nombre, String est1, String est2, String est3, int linea){
    this.nombre=nombre;
    String[] aux={est1, est2, est3};
    int cont=0;
    for(int i=0;i<aux.length;i++){
      if(aux[i]!=null){
        cont++;
      }
    }
    estaciones=new String[cont];
    cont=0;
    for(int i=0;i<aux.length;i++){
      if(aux[i]!=null){
        estaciones[cont]=aux[i];
        cont++;
      }
    }
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
