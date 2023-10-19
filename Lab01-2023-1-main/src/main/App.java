package main;
public class App {
    public static int encontre(int[] arrayOrdenado, int num){

    public static int encontre(int[] arrayOrdenado, int num) {

        int contador = 0;

        while (contador < arrayOrdenado.length - 1) {
                
            if (num == arrayOrdenado[contador]) {
                    
                return 1;

                }
                
            else {

                continue;

                }

            contador += 1;
        }
        
    return -1; 

}

    public static int maior(int[] arrayDesordenado){
        
        return -1;
    }

    public static Integer parMaisProximo(Integer[][] pares){
        
        return 1;
    }

    public static void main(String [] args) {

        int[] array1 = new int[] {1, 2, 3, 4, 5};

        System.out.println(encontre(array1, 3));

    }
    
}
