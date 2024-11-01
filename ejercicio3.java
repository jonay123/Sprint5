public class Main {
    static void ejercicio3(float temperatura, int edad, float numeroKilos) {
        int dosisParacetamol;

        if (temperatura < 38) {
            System.out.println("el niño está bien");
        } else if (temperatura <= 39) {
            System.out.println("es recomendable darle un baño para bajar la temperatura");
        } else if (temperatura > 39) {
            System.out.println("para mas de 40 grados hay que llevarlo al hospital");
        }

        if (edad < 3 && temperatura > 38) {
            System.out.println("debes consultar al médico");
        } else if (edad < 12 && temperatura > 38) {
            dosisParacetamol = 15 * (int) numeroKilos;
            System.out.println(dosisParacetamol + "mg de paracetamol");
        } else if (edad >= 12 && temperatura > 38) {
            {
                dosisParacetamol = 500;
                System.out.println("la dosis de paracetamol es: " + dosisParacetamol);
            }
            if (temperatura >= 40) {
                System.out.println("dosis de paracetamol cada 8 horas");
            }
        }
    }

    public static void main(String[] args) {
        ejercicio3(39, 11, 12);
    }
}
