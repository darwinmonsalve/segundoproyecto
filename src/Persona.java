import java.util.Scanner;

public class Persona {

        private static RecolectarPersonas [] personas = new RecolectarPersonas[5];
        private static Scanner scanner = new Scanner(System.in);

        public static void capturarPersonas() {
            System.out.println("por favor ingrese los datos de 5 personas al programa");
            for (int i = 0; i < 5 ; i ++){
                System.out.println("persona" + (i+1));
                System.out.println("ingrese el nombre: ");
                String nombre = scanner.nextLine();
                System.out.println("ingrese el apellido: ");
                String apellido = scanner.nextLine();
                String genero;
                while (true){
                    System.out.println("ingrese el genero (M = Masculino, F = Femenino): ");
                    genero = scanner.nextLine();
                    if (genero.equalsIgnoreCase("M")){
                        genero = "Masculino";
                        break;
                    }
                    else if (genero.equalsIgnoreCase("F")){
                        genero = "Femenino";
                        break;
                    }
                    else {
                        System.out.println("el genero ingresado no es valido, por favor ingrese un genero valido. ");
                    }
                }
                System.out.println("ingrese la edad: ");
                int edad = scanner.nextInt();
                scanner.nextLine();

                personas[i] = new RecolectarPersonas(nombre, apellido, genero, edad);
            }
        }

        public static String[] obtencionNombreYGeneros() {
            String[] obtencionNombreYGeneros = new String[5];
            for (int i = 0; i < 5; i++) {
                obtencionNombreYGeneros[i] = personas[i].getNombre() + " " + personas[i].getApellido() +" "+ personas[i].getGenero();
            }
            return obtencionNombreYGeneros;

        }

        public static double calcularPromedioEdades() {
            int suma = 0;
            for (RecolectarPersonas edades : personas) {
                suma += edades.getEdad();
            }
            return (double) suma / personas.length;
        }

        public static int contarMasculinos() {
            int contador = 0;
            for (RecolectarPersonas genero : personas) {
                if (genero.getGenero().equalsIgnoreCase("Masculino")) {
                    contador++;
                }

            }
            return contador;
        }

        public static int contarFemeninos() {
            int contador = 0;
            for (RecolectarPersonas genero : personas) {
                if (genero.getGenero().equalsIgnoreCase("Femenino")) {
                    contador++;
                }

            }
            return contador;
        }

        public static void main(String[] args) {
            capturarPersonas();
            System.out.println("Nombres y generos de las personas: ");
            for (String nombreYGenero : obtencionNombreYGeneros()) {
                System.out.println(nombreYGenero);
            }
            System.out.println("Promedio de edades: " + calcularPromedioEdades());
            System.out.println("Cantidad de personas de genero masculino: " + contarMasculinos());
            System.out.println("Cantidad de personas de genero femenino: " + contarFemeninos());
        }
}

