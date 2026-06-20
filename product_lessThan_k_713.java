package Sliding_Window;

public class product_lessThan_k_713 {
    public static void main(String[] args) {
        int [] arr={10,5,2,6};
        int k=100;
        System.out.println(productSubArray(arr,k));
    }
    public static int productSubArray(int [] arr, int k){

        int count=0;
        int ei=0;
        int si=0;
        int prd=1;
        while(ei<arr.length){
            // window grow karo
            prd=prd*arr[ei];
            // window small karenge
            while(prd>=k && si<=ei){
                prd=prd/arr[si];
                si++;
            }
           count =count + ei-si+1;
            ei++;
        }
        return count;
    }
}
