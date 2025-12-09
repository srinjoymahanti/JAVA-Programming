package _10_2DArrays;

public class _12_setMatrixZero {
    public static void setZeroes(int[][] arr) {
            int m=arr.length,n=arr[0].length;
            boolean[] row=new boolean[m];
            boolean[] column=new boolean[n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(arr[i][j]==0){
                        row[i]=true;
                        column[j]=true;
                    }
                }
            }
            for(int i=0;i<m;i++){//set the true rows to 0
                if(row[i]==true){
                    for(int j=0;j<n;j++){
                        arr[i][j]=0;
                    }
                }
            }
            for(int j=0;j<n;j++){//set the true columns to 0
                if(column[j]==true){
                    for(int i=0;i<m;i++){
                        arr[i][j]=0;
                    }
                }
            }
        }
    public  static void main(String[] args) {

        int[][] arr={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
