public class Operators {
    public static void main(String[] args) {
        //Sort arrays : ascending,
        int[] array = new int[20];
        int a = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = a++;
            System.out.print(array[i] + " ");

        }

        //Sort arrays : descending

        int[] array1 = new int[20];
        int x = 20;
        for (int j = 0; j < array.length; j++) {
            array[j] = x--;
            System.out.println(array[j] + " ");
            System.out.println("");
            System.out.println("");

        }


        //Sort matrix ascending


       System.out.println();
        int matric [][] = new int [4][5];
        int m = 0;
        for(int k = 0; k < 4; k++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                matric[k][j] = m++;
                System.out.print(matric [k][j] + " ");
            }

               //Sort matrix descending

            System.out.println();
            int matric1 [][] = new int [4][5];
            int m1 = 19;
            for(int c = 0; c < 4; c++ ){
                System.out.println();
                for(int z = 0; z < 5; z++){
                    matric1[c][z]= m1--;
                    System.out.print(matric1 [c][z] + " ");
                }
            }

        }




    }
}


