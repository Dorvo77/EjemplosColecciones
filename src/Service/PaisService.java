package Service;

import java.util.*;

/*
*Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
*
 */
public class PaisService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearPais(HashSet<String> paises) {
        char op;
        do {
            System.out.println("Ingrese el pais");
            String pais = sc.next();
            paises.add(pais);
            System.out.println("Continuar. y/n: ");
            op = sc.next().charAt(0);
        } while (op != 'n');
        System.out.println("");
        for (String pais : paises) {
            System.out.print("[" + pais + "] ");
        }
    }

    public void oredenar(HashSet<String> paises) {
        ArrayList<String> listaPaises = new ArrayList<>(paises);
        Collections.sort(listaPaises);
        System.out.println("\n--LISTA ORDENADA--");
        for (String pais : listaPaises) {
            System.out.print("{" + pais + "} ");
        }
        System.out.println("");
    }

    public void buscarPais(HashSet<String> paises) {
        Iterator<String> it = paises.iterator();
        boolean flag = false;
        System.out.println("> Ingrese el pais a buscar para eliminar: ");
        String paisBuscar = sc.next();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equalsIgnoreCase(paisBuscar)) {
                paises.remove(aux);
                flag = true;
                System.out.println("---- Se elimino el pais----");
                oredenar(paises);
                break;
            }
        }
        if (!flag) {
            System.out.println("--- No se encuentra el pais ingresado.---");
        }
    }
}
