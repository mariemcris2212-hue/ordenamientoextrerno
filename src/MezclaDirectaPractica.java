
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class MezclaDirectaPractica {

    /**
     * Toma dos archivos auxiliares (F1 y F2) con bloques ordenados de tamaño L,
     * los compara frente a frente y los guarda intercalados y ordenados en un archivo de salida.
     */
    public static void intercalarBloques(String archivoF1, String archivoF2, String archivoSalida, int L) {
        try (
                BufferedReader lector1 = new BufferedReader(new FileReader(archivoF1));
                BufferedReader lector2 = new BufferedReader(new FileReader(archivoF2));
                PrintWriter escritor = new PrintWriter(new FileWriter(archivoSalida))
        ) {
            // Leemos el primer número de cada archivo (el frente de cada fila)
            String linea1 = lector1.readLine();
            String linea2 = lector2.readLine();

            // Contadores para llevar la cuenta de cuántos números hemos sacado del bloque L actual
            int elementosEscritos1 = 0;
            int elementosEscritos2 = 0;

            // Mientras ninguno de los dos archivos se haya quedado vacío...
            while (linea1 != null && linea2 != null) {

                // CASO 1: Todavía quedan elementos por comparar en AMBOS bloques de tamaño L
                if (elementosEscritos1 < L && elementosEscritos2 < L) {
                    int val1 = Integer.parseInt(linea1);
                    int val2 = Integer.parseInt(linea2);

                    // TODO 1: Condición para saber si el número de F1 es menor o igual al de F2
                    if (val1 <= val2) {
                        escritor.println(val1);         // Guardamos el de F1 en la salida
                        linea1 = lector1.readLine();    // Avanzamos al siguiente número de F1
                        elementosEscritos1++;           // Aumentamos el contador del bloque 1
                    } else {
                        // TODO 2: Si el menor fue el de F2, hacemos lo mismo con F2
                        escritor.println(val2);         // Guardamos el de F2 en la salida
                        linea2 = lector2.readLine();    // Avanzamos al siguiente número de F2
                        elementosEscritos2++;           // Aumentamos el contador del bloque 2
                    }
                }
                // CASO 2: El bloque de F2 ya se acabó (llegó a L), vaciamos lo que sobró de F1
                else if (elementosEscritos1 < L) {
                    escritor.println(linea1);
                    linea1 = lector1.readLine();
                    elementosEscritos1++;
                }
                // CASO 3: El bloque de F1 ya se acabó primero, vaciamos lo que sobró de F2
                else {
                    // TODO 3: Vaciar el elemento restante de F2
                    escritor.println(linea2);
                    linea2 = lector2.readLine();
                    elementosEscritos2++;
                }
            }

            System.out.println("Bloque intercalado con exito!");

        } catch (IOException e) {
            System.out.println("Error en E/S de archivos: " + e.getMessage());
        }
    }


}