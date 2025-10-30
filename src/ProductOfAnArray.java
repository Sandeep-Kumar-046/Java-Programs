public class ProductOfAnArray {
    public static long arrayProduct(long[] arr)
    {
        long product=1;
        for(int i=0;i<arr.length;i++)
        {
            product*=arr[i];
        }
        if(1000000007 > product) return product;
        else return product % 1000000007;
    }
    public static void main(String[] args) {
        //Explanation: The product of the elements in the array is 1×2×3×4=24.
        //Since 24 is less than 1000000007, the output is simply 24.
        //Explanation:  The product of the array elements is 100000 × 100000 × 100000 = 1000000000000000.
        // Taking modulo 1000000007, the result is 1000000000000000 % 1000000007 = 993000007
        long arr[]={100000, 100000, 100000};
        System.out.println(arrayProduct(arr));
    }
}
