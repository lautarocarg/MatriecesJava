public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {
        String[][] nombres = {{"Pepe", "Pepa"},{"Josefa" ,"Paco" },{"Lucas" ,"Pancha" }};

        for (String[] fila: nombres) {
            for (String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();

        }
        System.out.println("\r\t ***** Con método *****");
        recorrerMatriz(nombres);
    }

    public static void recorrerMatriz(Object[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Elemento fila: " + i + " - columna: " + j + " : " + matriz[i][j]);
            }
        }
    }
}
