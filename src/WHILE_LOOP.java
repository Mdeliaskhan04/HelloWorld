public class WHILE_LOOP {
    public static void main(String[] args) {
        //WHILE LOOP
        //Odd number
        System.out.println("The odd number is: ");
        int i=1;
        while(i<10)
        {
            System.out.println(i);
            i=i+2;
        }
        System.out.println("The even number is: ");
        //even number
        int j=0;
        while(j<20)
        {
            System.out.println(j);
            j=j+2;
        }
        System.out.println("The sequential number is: ");
        int k=0;
        while(k<=20)
        {
            System.out.println(k);
            k++;
        }
        //DO...WHILE LOOP
        System.out.println("The sequential number is: ");
        int m=0;
        do {
            System.out.println(m);
            m++;
        }
        while(m<10);

        System.out.println("The even number is: ");
        int l=0;
        do{
            System.out.println(l);
            l=l+2;
        }
        while(l<=10);
    }
}
