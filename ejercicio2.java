public class Main {
    static void ejercicio2(int notaPrueba, int numeroEntregas, int totalEntrega, int notaPractica) {
        int notaEntregas= 0;
        boolean noSeguidaAC;
        if (notaPrueba < 7) {
            noSeguidaAC = true;
            System.out.println("esta suspendido por prueba final");
        } else if (numeroEntregas < (70 * totalEntrega) / 100) {
            System.out.println("no has seguido evaluación continua");
        } else if (numeroEntregas == (100 * totalEntrega) / 100) {
            notaEntregas = 10;
        } else if (numeroEntregas >=(90 * totalEntrega) / 100){
            notaEntregas = 8;
        } else if (numeroEntregas >= (80 * totalEntrega) / 100){
            notaEntregas = 7;
        } else if (numeroEntregas >=(70 * totalEntrega) / 100){
            notaEntregas = 4;
        }
        int notaFinal = ((20 * notaPrueba) / 100 + (10 * notaEntregas) / 100 + (70 * notaPractica) / 100);
        if (notaFinal < 5) {
            if (noSeguidaAC = true) {
                System.out.println("es necesario seguir evaluación continua");
            } else {
                System.out.println("realizar los ejercicios preparatorios para la PAF2");
            }
        }
    }
        public static void main (String[]args){
            ejercicio2(5, 10, 10, 5);
        }
    }
