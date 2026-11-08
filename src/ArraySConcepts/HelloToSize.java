package ArraySConcepts;

public class HelloToSize {

    public static void main(String args[])
    {

        String s="hello";
        int sum=0;

        for(int i=0;i<s.length()-1;i++) {

            char ch=s.charAt(i);
            char ch1=s.charAt(i+1);

            int a=ch;
            int b=ch1;

            System.out.println(a+" "+b);

            int c=Math.abs(a-b);

            sum=sum+c;

            System.out.println(c);



        }

        System.out.println("SUM OF THE STRING IS : "+sum);
    }
}
