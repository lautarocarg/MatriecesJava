public class EjemploMatricesBuscarElemento {
    public static void main(String[] args) {
        int[][] matrizEnteros = {
                {35, 90,3, 1978},
                {65, 68, 8985, 36},
                {974, 454, 865, 5}
        };

        int elementoBuscar = 8625;
        boolean encontrado = false;

        int i;
        int j = 0;

        buscar: for(i = 0; i < matrizEnteros.length; i++){
            for(j = 0; j < matrizEnteros[i].length; j++){
                if( matrizEnteros[i][j] == elementoBuscar){
                    encontrado = true;
                    break buscar;
                }
            }
        }
        if(encontrado){
            System.out.println("El elemento " + elementoBuscar + " se ecuentra en la martriz en la posicion: " +  i + " - " + j);
        }
        else{
            System.out.println("El elemento " + elementoBuscar + " NO se ecuentra en la martriz");
        }
    }
}
