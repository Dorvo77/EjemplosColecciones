import Service.PostalesService;

import java.util.HashMap;
import java.util.Scanner;

public class Main_Extra4 {
    public static void main(String[] args) {
        HashMap<Integer, String> codigos = new HashMap<>();
        PostalesService ps = new PostalesService();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("\tCARGA INICIAL DE CODIGOS.... ");
        for (int i = 0; i < 3; i++) {
            ps.cargarCodigos(codigos);
        }
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("\t--- MENU ---");
            System.out.println("1. Alta Codigo Postal");
            System.out.println("2. Consulta de CP");
            System.out.println("3. Eliminar CP");
            System.out.println("4. Mostrar Listado de CP");
            System.out.println("5. Salir");
            System.out.print("> Ingrese Opcion: > ");
            opcion = sc.nextInt();
            ps.opcionCodigos(codigos, opcion);
        }
    }
}
