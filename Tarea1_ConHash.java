import java.util.HashSet;

public class Tarea1_ConHash {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int K = 10;
        boolean existe = false;
        int num1 = 0, num2 = 0;

        HashSet<Integer> vistos = new HashSet<>();

        // Buscar par usando HashSet
        for (int num : lista) {
            int complemento = K - num;
            if (vistos.contains(complemento)) {
                existe = true;
                num1 = num;
                num2 = complemento;
                break; // encontramos un par, salimos
            }
            vistos.add(num);
        }

        // Resultado final
        if (existe) {
            System.out.println("Sí existe un par que suma " + K + ": (" + num1 + ", " + num2 + ")");
        } else {
            System.out.println("No existe ningún par que sume " + K);
        }
    }
}
