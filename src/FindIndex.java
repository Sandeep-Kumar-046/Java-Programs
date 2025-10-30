import java.util.Arrays;

public class FindIndex {
    static int[] findIndex(int[] arr,int key)
    {
        int count=0;
        for(int num:arr)
        {
            if(num == key)
            {
                count++;
            }
        }
        int[] arr2=new int[count];
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == key)
            {
                arr2[index] = i;
                index++;
            }
        }
        return arr2;
    }
    public static void main(String[] args) {
        int[] arr={6, 5, 4, 3, 1, 2};
        System.out.println(Arrays.toString(findIndex(arr,4)));
    }
}
