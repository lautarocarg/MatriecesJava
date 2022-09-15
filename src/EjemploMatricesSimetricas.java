public class EjemploMatricesSimetricas {
    public static void main(String[] args) {
        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        boolean simetrica = true;
        //Con for
        forSimetrica: for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < i; j++){
                if(matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                    break forSimetrica;
                }
            }
        }

//        int i,j;
//        i= 0;
//        while (i < matriz.length && simetrica == true){
//            j = 0;
//            while (j < i && simetrica == true){
//                if(matriz[i][j] != matriz[j][i]){
//                    simetrica = false;
//                }
//                j++;
//            }
//            i++;
//        }

        if (simetrica){
            System.out.println("La matriz es simetrica");
        }
        else{
            System.out.println("La matriz no es simetrica");

        }
    }
}
