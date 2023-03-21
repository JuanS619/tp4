import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ejercicio2 {
    /*haga un main donde por parametro envie la ruta de un archivo. ese archivo dedbe contener numeros. el programa debe escribir
    * por consola la suma de esos numeros. a. al programa anterior agreguele el parametro para que se pueda multiplicar o sumar*/
    public static void main(String[] args) throws FileNotFoundException {
        File Path = new File("C:\\Users\\Juan\\Desktop\\java-argentina-programa\\3. tareas-codigos\\tp4\\ejercicio2.txt");
        String opcion = " ";
        Scanner elegir_opcion = new Scanner(System.in);
        System.out.println("Digite s- si quiere sumar; p- si quiere multiplicar.");
        opcion = elegir_opcion.nextLine();
        calcular(Path, opcion);

    }
    public static int calcular(File archivo, String opcion) throws FileNotFoundException{
        int suma=0, producto = 1, resultado=0;
        if(opcion.equals("s")) {
            Scanner sumar = new Scanner(archivo);
            while (sumar.hasNextInt()) {
                suma += sumar.nextInt();
            } System.out.print("El resultado de la suma es: "+suma);
            return suma;
        } else if (opcion.equals("p")) {
            Scanner multi = new Scanner(archivo);
            while (multi.hasNextInt()) {
                producto *= multi.nextInt();
            } System.out.print("El resultado de la suma es: "+producto);
            return producto ;
        }
        else {
            System.out.println("Lo que usted digito esta fuera del rango de las opciones puestas en pantallas.");
        }return resultado;

    }
}
