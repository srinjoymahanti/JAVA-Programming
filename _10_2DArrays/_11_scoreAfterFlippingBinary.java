package _10_2DArrays;

public class _11_scoreAfterFlippingBinary {
    public static void main(String[] args){
        int[][] arr={{0,0,1,1},{1,0,1,0},{1,1,0,0}};


                int m=arr.length,n=arr[0].length;

                for(int i=0;i<m;i++){//check the first column
                    if(arr[i][0]==0){
                        for(int j=0;j<n;j++){//flip the row
                            if(arr[i][j]==0) arr[i][j]=1;
                            else arr[i][j]=0;
                        }
                    }
                }
                //flip columns where no of 0s > no of 1s
                for(int j=1;j<n;j++){
                    int noOfZeros=0,noOfOnes=0;
                    for(int i=0;i<m;i++){
                        if(arr[i][j]==0) noOfZeros++;
                        else noOfOnes++;
                    }
                    if(noOfZeros>noOfOnes){
                        for(int i=0;i<m;i++){//flip the column
                            if(arr[i][j]==0) arr[i][j]=1;
                            else arr[i][j]=0;
                        }
                    }
                }
                int score=0;
                for(int i=0;i<m;i++){
                    int x=1;
                    for(int j=n-1;j>=0;j--){
                        score+=(arr[i][j]*x);
                        x*=2;
                    }

                }
            System.out.println(score);

    }


}
