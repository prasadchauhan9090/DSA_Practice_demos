public class SumOfTheDigigtOfTheNumber {


    public static void main(String args[])
    {

        int number=12345;
        int count=0;
        int sum=0;

        while(number>0)
        {
            int rem=number%10;
            count=count+1;
            sum=sum+rem;
            number=number/10;

        }
        System.out.println("SUM OF THE GIVEN NUMBER IS: "+sum);
        System.out.println("COUNT OF THE GIVEN NUMBER: "+count);




    }
}
