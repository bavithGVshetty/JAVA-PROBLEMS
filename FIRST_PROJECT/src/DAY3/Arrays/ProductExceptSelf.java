package DAY3.Arrays;

import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] PES(int[] speeds){
        int n=speeds.length;
        int[] result =new int[n];

        result[0]=1;
        // PREFIX PRODUCT
        for(int i=1;i<n;i++){
            result[i]=result[i-1]*speeds[i-1];
        }

        // SUFFIX PRODUCT
        int suffix=1;
        for(int i=n-1;i>=0;i--){

            result[i]=result[i]*suffix;
            suffix=suffix*speeds[i];
        }
    return result;        
    }

    public static void main(String[] args) {
        int [] speeds={1,2,3,4};

        String output=Arrays.toString(PES(speeds));
        System.out.println(output);

    }
    
}
