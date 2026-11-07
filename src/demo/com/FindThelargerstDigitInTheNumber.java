package demo.com;

public class FindThelargerstDigitInTheNumber {

    public static void main(String args[])
    {


        int number=1234567;
        int largeDigit=0;
        int smallDigit=4;
        int temp=number;


        while(temp>0)
        {
            int remainder1=temp%10;

            if(remainder1<smallDigit)
            {
                smallDigit=remainder1;
            }

            temp = temp/10;

        }

        temp=number;

        while(temp>0)
        {
            int remainder=temp%10;

            if(remainder>largeDigit)
            {
                largeDigit=remainder;
            }

            temp = temp/10;

        }


        System.out.println("SMALLEST NUMBER IN THE DIGIT IS:  "+smallDigit);
        System.out.println("LARGEEST NUMBER IN THE DIGIT IS:  "+largeDigit);

    }
}
