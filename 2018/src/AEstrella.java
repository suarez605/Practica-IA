import java.util.ArrayList;
public class AEstrella {

  public ArrayList<Estacion> aEstrella(Estacion[] estaciones, Estacion origen, Estacion destino){
    ArrayList<Estacion> result=new ArrayList<Estacion>();
    if(origen.getNombre().equals(destino.getNombre())){
      result.add(origen);
    }
    else if(origen.getLinea()==destino.getLinea()){
      Estacion actual=origen;
      Estacion anterior=new Estacion("",null,null,null,-1);
      Estacion primerCamino=new Estacion("",null,null,null,-1);
      boolean inicio=true;
      boolean vfinal=false;
      boolean aux=false;
      boolean aux2=false;
      int i=0;
      int j=0;
      while(!vfinal){
        result.add(actual);
        aux=false;
        i=0;
        while(!aux){
          if(!primerCamino.getNombre().equals(actual.getEstaciones()[i])&&!anterior.getNombre().equals(actual.getEstaciones()[i])){
            aux2=false;
            j=0;
            while(!aux2){
            	String[] aux3 = actual.getEstaciones();
              if(estaciones[j].equals(aux3[i])){
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
            result.clear();
            actual=origen;
            aux=true;
          }
          i++;
        }
        if(actual.getNombre().equals(destino.getNombre())){
          result.add(actual);
          vfinal=true;
        }
      }
    } 
    
     
    
    else{
      ArrayList<Estacion> resultaux =new ArrayList<Estacion>();
      ArrayList<Estacion> resultaux2 =new ArrayList<Estacion>();
      Estacion actual=origen;
      Estacion anterior=new Estacion("",null,null,null,-1);
      boolean vfinal=false;
      boolean aux=false;
      boolean aux2=false;
      int nTrasbordos=0;
      int i=0;
      int j=0;
      int h=0;
      
      //bucle para los 2 finales posibles y poder guardarlos en variables aux
      while(h<2){
        while(!vfinal && nTrasbordos<2){// Para coger caminos que hagan 2 o menos trasbordos al destino.
        //Evitando casos inutiles que llegaban cogiendo 4 trasbordos o infinitos
          result.add(actual);
          aux=false;
          i=0;
          while(!aux){
            if(!anterior.getNombre().equals(actual.getEstaciones()[i])){
              aux2=false;
              j=0;
              while(!aux2){
            	  String[] aux3 = actual.getEstaciones();
                if(estaciones[j].equals(aux3[i])){ //dudamos que hace esta linea
                  aux2=true;
                  anterior=actual;
                  actual=estaciones[j];
                  aux=true;
                  if(actual.getLinea()!=anterior.getLinea()){ //comprobar si ha hecho trasbordo
                  nTrasbordos++;
                  }
                }
                j++;
              }
            }
          if(i==actual.getEstaciones().length-1&&!aux){
            result.clear();
            actual=origen;
            aux=true;
           }
           i++;
          }
          if(actual.getNombre().equals(destino.getNombre())){
          result.add(actual);
          vfinal=true;
          }
        }
        
        //primer camino encontrado, lo guardamos en un aux para poder comparar
        if(h=0){
         resultaux = result.clone();
          h++;
        } //otro camino que llega
        if(h=1 && resultaux.size()!=result.size()){ 
         resultaux2 = result.clone();
          h++;
        }
        
         
       
      }//llave del while de menor 3 caminos
      
      
      //comparacion de caminos y nos quedamos el pequeño
      if(resultaux.size()>=resultaux2.size()){
         result = resultaux2.clone();
      }
      else{
        result = resultaux.clone();
      }
      
    }//lave del else (lineas diferentes)

    return result;
  }

}
