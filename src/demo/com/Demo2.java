package demo.com;

public class Demo2 {


    public static void main(String args[])
    {
        int a=581;
        int highernumber=0;
        int temp=a;
        int mixednumber=0;

              while (temp>0) {
                  int rem = temp % 10;
                if(rem > mixednumber)
                {
                  mixednumber=rem;
              }
             temp=temp/10;
          }
          System.out.println(mixednumber);
    }
}
