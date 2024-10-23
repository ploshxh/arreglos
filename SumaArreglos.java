package operadoresh;


public class SumaArreglos {
    
    public static void main (String[] args){
        
        float[] edad={12, 56, 45, 67, 43, 243, 56, 78, 23, 35, 89, 45};
        
        System.out.println("la suma de las edades es:" + suma(edad));
        System.out.println("El promedio de las edades de los alumnos es: "+ promedio(edad));

        
    }
    
    public static int suma(float edad[] ) {
        
            int suma = 0;
            for(int i =0; i<edad.length; i++){
                suma += edad[i];
            }
            return suma;
        }
    }
    // metodo promedio 
     public static double promedio(float edad[]){
        
     double suma = suma(edad);
     double promedio = suma / edad.length;
     return promedio;
 }
}
