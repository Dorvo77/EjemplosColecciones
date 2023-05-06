import java.util.ArrayList;
import java.util.Scanner;

public class Mextra_1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int suma =0;
        double media;
        System.out.println("Ingrese un numero entero");
        Integer num = sc.nextInt();
        while(num != -99){
            numeros.add(num);
            suma+=num;
            System.out.println("Ingrese un numero entero");
            num=sc.nextInt();
        }
        media= (double) suma / numeros.size();
        System.out.println("La suma es: "+ suma);
        System.out.println("La media es: "+media);
        System.out.println("El tamanio de la lista es: "+numeros.size());
    }
}
