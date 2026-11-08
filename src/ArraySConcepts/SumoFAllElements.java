package ArraySConcepts;

public class SumoFAllElements {

    public static void main(String args[]) {
        int arr[] = {1, 2, 3};
        int sum = 0;


        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }

        System.out.println("SUM OF ALL THE DIGITS IN THE ARRAY IS: "+sum);
    }


}
