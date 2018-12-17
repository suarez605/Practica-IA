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
							if(estaciones[j].getNombre().equals(aux3[i])){
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
							if(j>=estaciones.length){
								aux2=true; 
							}
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
			Estacion prohibida=new Estacion("",null,null,null,-1);
			ArrayList<Estacion> prohibidas=new ArrayList<Estacion>();
			prohibidas.add(prohibida);
			boolean vfinal=false;
			boolean inicio=true;
			boolean aux=false;
			boolean aux2=false;
			boolean prohibidoAux=false;
			int i=0;
			int j=0;

			for(int h=0;h<2;h++){
				while(!vfinal){
					result.add(actual);
					aux=false;
					i=0;
					while(!aux){
						if(!anterior.getNombre().equals(actual.getEstaciones()[i])){
							aux2=false;
							prohibidoAux=false;
							j=0;

							for(int k=0;k<prohibidas.size();k++){
								if(actual.getEstaciones()[i].equals(prohibidas.get(k).getNombre())){
									prohibidoAux=true;
								}
							}

							if(!prohibidoAux){
								while(!aux2){
									String[] aux3 = actual.getEstaciones();
									if(estaciones[j].getNombre().equals(aux3[i])){
										if(anterior.getEstaciones().length>=3&&actual.getEstaciones().length<3){
											prohibida=actual;
										}
										aux2=true;
										anterior=actual;
										actual=estaciones[j];
										aux=true;
										if(inicio){
											prohibida=actual;
											inicio=false;
										}
									}
									j++;
									if(j>=estaciones.length){
										aux2=true; 
									}
								}
							}
						}
						if(i==actual.getEstaciones().length-1&&!aux){
							result.clear();
							actual=origen;
							prohibidas.add(prohibida);
							aux=true;
						}
						i++;
					}
					if(actual.getLinea()==destino.getLinea()){
						result.add(actual);
						prohibidas.add(actual);
						vfinal=true;
					}
				}

				if(h==0){
					for(int k=0;k<result.size();k++){
						resultaux.add(result.get(k));
					}
					vfinal=false;
					anterior=new Estacion("",null,null,null,-1);
					result.clear();
					actual=origen;
				} 
				
				if(h==1){ 
					for(int l=0;l<result.size();l++){
						resultaux2.add(result.get(l));
					}
					anterior=new Estacion("",null,null,null,-1);
					result.clear();
					actual=origen;
				}
			}
			
			result.clear();
			Estacion origenAux=new Estacion("",null,null,null,-1);
			anterior=new Estacion("",null,null,null,-1);
			prohibida=new Estacion("",null,null,null,-1);
			inicio=true;
			vfinal=false;
			aux=false;
			aux2=false;
			i=0;
			j=0;
			
			for(int h=0;h<2;h++){
				
				if(h==0){
					actual=resultaux.get(resultaux.size()-1);
					origenAux=actual;
					resultaux.remove(resultaux.size()-1);
				}
				if(h==1){
					actual=resultaux2.get(resultaux2.size()-1);
					origenAux=actual;
					resultaux2.remove(resultaux2.size()-1);
				}
				
				while(!vfinal){
					result.add(actual);
					
					aux=false;
					i=0;
					while(!aux){
						if(!prohibida.getNombre().equals(actual.getEstaciones()[i])&&!anterior.getNombre().equals(actual.getEstaciones()[i])){
							aux2=false;
							j=0;
							while(!aux2){
								String[] aux3 = actual.getEstaciones();
								if(estaciones[j].getNombre().equals(aux3[i])){
									aux2=true;
									if(estaciones[j].getLinea()==actual.getLinea()){
										anterior=actual;
										actual=estaciones[j];
										aux=true;
										if(inicio){
											prohibida=actual;
											inicio=false;
										}
									}
								}
								j++;
								if(j>=estaciones.length){
									aux2=true; 
								}
							}
						}
						if(i==actual.getEstaciones().length-1&&!aux){
							result.clear();
							actual=origenAux;
							aux=true;
						}
						i++;
					}
					if(actual.getNombre().equals(destino.getNombre())){
						result.add(actual);
						vfinal=true;
					}
				}
				
				if(h==0){
					for(int k=0;k<result.size();k++){
						resultaux.add(result.get(k));
					}
					vfinal=false;
					result.clear();
					inicio=true;
				}
				
				if(h==1){ 
					for(int k=0;k<result.size();k++){
						resultaux2.add(result.get(k));
					}
					result.clear();
				}
				
			}

			if(resultaux.size()>=resultaux2.size()){
				for(int n=0;n<resultaux2.size();n++){
					result.add(resultaux2.get(n));
				}
			}
			else{
				for(int m=0;m<resultaux.size();m++){
					result.add(resultaux.get(m));
				}
			}
		}
		return result;
	}
}
