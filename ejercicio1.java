public class Main {
    static void ejercicio1 (int edad) {
        int ciclo=0;
        int curso=0;
        if (edad < 3) {
            System.out.println("es demasiado pequeño");
        } else if (edad < 6) {
            ciclo = 0;
            } else if (edad < 7) {
            curso = 1;
            ciclo = 1;
                } else if (edad < 8) {
                curso = 2;
                ciclo = 1;
                    } else if (edad < 9) {
                    curso = 3;
                    ciclo = 2;
                        } else if (edad < 10) {
                        curso = 4;
                        ciclo = 2;
                            } else if (edad < 11) {
                            curso = 5;
                            ciclo = 3;
                                } else if (edad < 12) {
                                curso = 6;
                                ciclo = 3;
                                    } else {
                                    System.out.println("Es demasiado grande");
        }
        if (ciclo == 0) {
            System.out.println("es de educación infantil");
        }
        if (ciclo == 1) {
            System.out.println("es de educación primaria, ciclo inicial");
        }
        if (ciclo == 2) {
            System.out.println("es de educación primaria, ciclo medio");
        }
        if (ciclo == 3) {
            System.out.println("es de educación primaria, ciclo superior");
        }
        System.out.println("su curso es: " + curso);
        }
        public static void main(String[] args) {
       ejercicio1(6);
    }
}
