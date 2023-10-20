package main;
public class App {
    
    public static int encontre(int[] arrayOrdenado, int num) {

        boolean encontrou = false;

        for (int i = 0; i < arrayOrdenado.length; i++) {

            if (num == arrayOrdenado[i]) {

                encontrou = true;
                return 1;
            }
        }

        if (encontrou == false) {

            return 0;
        }
        
        return -1;
}

 public static int maior(int[] arrayDesordenado) {

        int maior = arrayDesordenado[0];

        for (int i = 0; i < arrayDesordenado.length; i++) {

            if (arrayDesordenado[i] > maior) {

                maior = arrayDesordenado[i];
            }

        }
        return maior;
    }
    
    public static Integer parMaisProximo(Integer[][] pares) {
        
        return 1;
    }

    public static void main(String [] args) {

        int[] array1 = new int[] {1, 2, 3, 4, 5};

        System.out.println(encontre(array1, 3));
        System.out.println(maior(array1));
    }
    
}
