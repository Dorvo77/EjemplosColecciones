import Service.PaisService;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello welcome");
        HashSet<String> paises = new HashSet<>();
        PaisService ps = new PaisService();
        ps.crearPais(paises);
        ps.oredenar(paises);
        ps.buscarPais(paises);

    }
}