
package com.mycompany.prueba1;
import java.util.Scanner;

/**
 *
 * @author caro.ffl
 */
public class Ejercicio12Agosto {

     public static void main(String[] args) {
        String[] nomRegiones = new String[]{"Tarapacá", "Antofagasta", "Coquimbo", "Vaparaíso", "O'Higgins", "El Bío Bío", "Los Lagos", "Aysén",
                "Magallanes y Antártica Chilena", "Región Metropolitana de Santiago", "Los Ríos", "Arica y Parinacota", "Ñuble"};


        int[][] alimentacionPorRegion = {{97479, 194958, 100000, 29972},
                {97479, 299667, 149833, 29972},
                {194958, 97479, 29972, 123833},
                {325678, 194958, 874342, 29972},
                {97479, 29972, 83723, 194958},
                {29972, 194958, 98345, 29972},
                {97479, 123833, 324567, 123833},
                {345456, 194958, 984532, 29972},
                {123833, 194958, 345456, 29972},
                {345456, 194958, 456328, 29972},
                {123833, 194958, 76453, 29972},
                {97479, 194958, 54245, 29972},
                {97479, 194958, 54245, 29972},
        };
        //FunciOn 1
        System.out.println(obtieneNombreRegionConMasVeganos(nomRegiones, alimentacionPorRegion));
        
        // FunciOn 2
		double[] result = porcentajeDeNoCarnivorosPorRegion(nomRegiones, alimentacionPorRegion);
        
       for (int i = 0; i < result.length; i++) {
           System.out.println("En la region de " +nomRegiones[i]+" el "+ result[i] + "% de su población es no carnivora ");
        }
        String [] alimentacion = {"vegetarianos", "carnivoros", "veganos", " basada en plantas"};
        // Función 3
		System.out.println("El porcentaje de alimentacion "+ alimentacion[3]+ " para la region de "+ nomRegiones[5-1]+" es "+ porcentajeDeTipoDeAlimentacionPorRegion(nomRegiones,alimentacionPorRegion,3,5));
    }

    public static String obtieneNombreRegionConMasVeganos(String[] nomRegiones, int[][] alimentacionPorRegion) {
		int mayor=0;
		int region=0;
        for(int i=0;i<13;i++){
			if(alimentacionPorRegion[2][i]>mayor){
				mayor=alimentacionPorRegion[2][i];
				region=i;
			}
		}
		
		return nomRegiones[region];
    }

	public static double[] porcentajeDeNoCarnivorosPorRegion(String[] nomRegiones, int[][] alimentacionPorRegion) {
       double[]porcentaje=new double[nomRegiones.length];
	   int suma,total;
	   for(int i=0;i<13;i++){
		   suma=0;
		   total=0;
		   
		   for(int j=0;j<4;j++){
				total+=alimentacionPorRegion[i][j];
				if(j!=1){
					suma+=alimentacionPorRegion[i][j];
				}
		   }
		   
		   porcentaje[i]=(double)((suma/total))*100;
	   }
	   return porcentaje;
    }

  public static double porcentajeDeTipoDeAlimentacionPorRegion(String[] nomRegiones, int[][] alimentacionPorRegion, int alimentacion, int region) {
	  int suma, total;
	  suma=0;
	  total=0;
	  for(int i;i<4);i++{
		  
		  
	  }
  }
}
