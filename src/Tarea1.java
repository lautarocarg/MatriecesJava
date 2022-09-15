import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el orden de la matriz: ");
        int orden = s.nextInt();

        String[][] matriz = new String[orden][orden];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i == j || (i+j) == (matriz.length-1)){
                    matriz[i][j] = "X";
                }
                else{
                    matriz[i][j] = "_";
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
