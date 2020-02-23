package offficeHour;

public class Array3D {
    public static void main(String[] args) {

        //3D ARRAY:
        int[][][] arr3D={  {{1,3,4,5,6},{34,5,666,7}} , {{77,3,89,698,896},{34,99,76,47}}  };

        int maxNum=arr3D[0][0][0];

        for (int i = 0; i < arr3D.length; i++) {
            for (int j = 0; j < arr3D[i].length; j++) {
                for (int k = 0; k < arr3D[i][j].length; k++) {
                    for (int l = 0; l < arr3D[i][j][k]; l++) {
                        if(maxNum<arr3D[i][j][k]){
                            maxNum=arr3D[i][j][k];
                        }

                    }



                }
                
            }
            
        }
        System.out.println("MaxNumber= "+maxNum);
        //Second Max number
        int secondMax=maxNum;
        for (int i = 0; i < arr3D.length; i++) {
            for (int j = 0; j < arr3D[i].length; j++) {
                for (int k = 0; k < arr3D[i][j].length; k++) {
                    for (int l = 0; l < arr3D[i][j][k]; l++) {
                        if(arr3D[i][j][k]>maxNum && arr3D[i][j][k]!=maxNum ){
                            secondMax=arr3D[i][j][k];
                        }



                    }



                }

            }
            System.out.println("SECOND MAX NUM "+ secondMax);

        }

        





    }
}
