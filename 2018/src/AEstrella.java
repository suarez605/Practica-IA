import java.util.ArrayList;

public class AEstrella {

  public ArrayList<Estacion> aEstrella(Estacion[] estaciones, Estacion origen, Estacion destino){
    if(origen.getLinea()==destino.getLinea()){
      Estacion actual=origen;
      Estacion anterior=origen.getEstaciones.get(1);
      ArrayList<Estacion> result=new ArrayList<Estacion>();
      boolean final=false;
      while(!final){
        result.add(actual);
        for(int i=0;i<actual.getEstaciones().size();i++){
          if(!actual.getEstaciones().get(i).getNombre().equals(anterior.getNombre())&&actual.getEstaciones().get(i).getLinea()==actual.getLinea()){
            anterior=new;
            actual=actual.getEstaciones().get(i);
          }
        }
        
      }
    }
    else{
      
    }
  }
  
}
