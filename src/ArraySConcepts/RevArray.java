package ArraySConcepts;

public class RevArray {

    public static void main(String args[])
    {
        int arr[]={1,2,3,4,6,7,8,9};
        int reverse=0;

        for(int i=arr.length-1 ;i>=0 ;i--)
        {
            reverse=arr[i];

            System.out.print(reverse+" ");
        }

    }
}
