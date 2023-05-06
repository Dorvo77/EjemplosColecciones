package Service;

import java.util.HashMap;
import java.util.Scanner;

public class PostalesService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public void cargarCodigos(HashMap<Integer, String> codigos){
        System.out.print("Ingrese codigo postal: >");
        Integer cod = sc.nextInt();
        System.out.print("Ingrese nombre de la ciudad: > ");
        String nom = sc.next();
        codigos.put(cod,nom);
    }

    public void opcionCodigos(HashMap<Integer, String> codigos, int opcion) {
        switch (opcion) {
            case 1 -> cargarCodigos(codigos);
            case 2 -> buscarCodigo(codigos);
            case 3 -> eliminarCodigo(codigos);
            case 4 -> mostrarCP(codigos);
            case 5 -> System.out.println("EXIT....");
            default -> System.out.println("Ingrese opcion valida.....");
        }
    }

    public  void eliminarCodigo(HashMap<Integer, String> codigos) {
        System.out.print("\nIngrese CP a ELIMINAR: >");
        Integer cod = sc.nextInt();
        if(codigos.containsKey(cod)){
            codigos.remove(cod);
            System.out.println(" # Codigo Postal ELIMINADO....");
        }else {
            System.out.println(" # El codigo ingresado NO EXISTE. !!");
        }
    }

    public void mostrarCP(HashMap<Integer, String> codigos) {
        System.out.println("\t------- LISTADO DE CP --------");
        for (Integer cod: codigos.keySet()) {
            System.out.println("\tCP:"+cod +" -> "+ codigos.get(cod));
        }
    }

    public void buscarCodigo(HashMap<Integer, String> codigos) {
        System.out.print("\nIngrese CP: >");
        Integer cod = sc.nextInt();
        if(codigos.containsKey(cod)){
            System.out.println("CP: "+cod+" -> "+codigos.get(cod));
        }else {
            System.out.println(" # El codigo ingresado NO EXISTE. !!");
        }
    }
}
