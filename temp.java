public class temp {
    public static void main(String[] args){
        int arr[] []= {
                        {4,7,8},
                        {8,8,7}
                    };
        int numRows = arr.length;
        int count = 0;
        int numCols = arr[0].length;
        for(int i =0; i <numRows; i++){
            for(int j=0; j<numCols;j++){
                if(arr[i][j] == 7 ){
                    count++;
                }          }
        }
        System.out.println("Number of 7s in the 2D array: " + count);
    }
}

