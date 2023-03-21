import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        ingresar(numeros);
        mostrar_orden(numeros);

    }

    private static int mostrar_orden(int[] numeros){
        String ordenar = "asc";
        Scanner digitar_orden = new Scanner(System.in);


        System.out.println("Introduzca orden asc o desc: ");
        String condicion = digitar_orden.nextLine();
        if(ordenar.equals(condicion)){
            System.out.println("Orden ascendente: ");
            orden_asc(numeros);

        } else {
            System.out.println("Orden descentente: ");
            for(int i=numeros.length-1; i>=0 ;i--){
                ordenar(numeros);
                System.out.println(numeros[i] + ";");
            }
        }
        return numeros.length;
    }
    private  static int ingresar(int[] numeros){
        Scanner ingresar_numeros = new Scanner(System.in);
        System.out.println("Digite 10 números a ordenar: ");
        for(int i = 0; i < numeros.length ; i++){
            int numero_ingresado = ingresar_numeros.nextInt();
            numeros[i] = numero_ingresado;
        }
        return numeros.length;
    }
    private static int ordenar(int[] numeros_ordenar) {
        int aux = 0;
        for (int i = 0; i < numeros_ordenar.length - 1; i++) {
            for (int j = 0; j < numeros_ordenar.length - 1; j++) {
                if (numeros_ordenar[j] > numeros_ordenar[j + 1]) {
                    aux = numeros_ordenar[j];
                    numeros_ordenar[j] = numeros_ordenar[j + 1];
                    numeros_ordenar[j + 1] = aux;
                }
            }
        }
        return numeros_ordenar.length;
    }
    private static int orden_asc(int[] asc_orden){
        for(int i=0; i<asc_orden.length;i++){
            ordenar(asc_orden);
            System.out.println(asc_orden[i] + ";");
        }
        return asc_orden.length;
    }


}
