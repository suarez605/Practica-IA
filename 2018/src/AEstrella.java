import java.util.ArrayList;

public class AEstrella {

  public ArrayList<Estacion> aEstrella(Estacion[] estaciones, Estacion origen, Estacion destino){
    if(origen.getLinea()==destino.getLinea()){
      ArrayList<Estacion> result=new ArrayList<Estacion>();
      Estacion actual=origen;
      Estacion anterior=new Estacion("",null,null,null,-1);
      Estacion primerCamino=new Estacion("",null,null,null,-1);
      boolean inicio=true;
      boolean final=false;
      boolean aux=false;
      boolean aux2=false;
      int i=0;
      int j=0;
      while(!final){
        result.add(actual);
        aux=false;
        i=0;
        while(!aux){
          if(!primerCamino.equals(actual.getEstaciones()[i])&&!anterior.getNombre().equals(actual.getEstaciones()[i])){
            aux2=false;
            j=0;
            while(!aux2){
              if(estaciones[j].equals(actual.getEstaciones[i])){
                aux2=true;
                if(estaciones[j].getLinea()==actual.getLinea()){
                  anterior=actual;
                  actual=estaciones[j];
                  aux=true;
                  if(inicio){
                    primerCamino=actual;
                    inicio=false;
                  }
                }
              }
              j++;
            }
          }
          if(i==actual.getEstaciones().length-1&&!aux){
            ArrayList<Estacion> result=new ArrayList<Estacion>();
            Estacion actual=origen;
            aux=true;
          }
          i++;
        }
        if(actual.getNombre().equals(destino.getNombre())){
          result.add(actual);
          final=true;
        }
      }
    }
    return result;
  }
}
