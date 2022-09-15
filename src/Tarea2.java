import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el orden de la matriz: ");
        int orden = s.nextInt();

        String[][] matriz = new String[orden][orden];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(j == 0 || i == (matriz.length/2) || (j == matriz.length-1 && i > (matriz.length/2)) ){
                    matriz[i][j] = "1";
                }
                else{
                    matriz[i][j] = "0";
                }
            }

        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
