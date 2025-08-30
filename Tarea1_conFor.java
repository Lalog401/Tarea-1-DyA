public class Tarea1_conFor {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int K = 10;
        boolean existe = false;
        int num1 = 0, num2 = 0; // para guardar el par encontrado

        // Buscar si existe al menos un par que sume K
        for (int i = 0; i < lista.length; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i] + lista[j] == K) {
                    existe = true;
                    num1 = lista[i];
                    num2 = lista[j];
                    break; // salimos del segundo for
                }
            }
            if (existe) break; // salimos también del primero
        }

        // Mostrar resultado final
        if (existe) {
            System.out.println("Sí existe un par que suma " + K + ": (" + num1 + ", " + num2 + ")");
        } else {
            System.out.println("No existe ningún par que sume " + K);
        }
    }
}
