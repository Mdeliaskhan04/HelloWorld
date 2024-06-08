public class FOR_LOOP {
    public static void main(String[] args) {
        System.out.println("The Sequential Number: ");
        for(int i=0;i<=20;i++)
        {
            System.out.println(i);
        }
        System.out.println("The odd number is: ");
        for(int j=1;j<=20;j=j+1)
        {
            System.out.println(j);
        }
        //For-each loop
        String[] cars={"Toshiba","Volvo","Pajero"};
        for(String i:cars)
        {
            System.out.println(i);
        }
    }
}
