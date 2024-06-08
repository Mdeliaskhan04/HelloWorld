public class Operators {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 35;
        //Arithmetic Operators
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(15/5);
        System.out.println(num1%num2);
        System.out.println(++num1);
        System.out.println(--num1);
        //logical operators
        System.out.println(num1>100&&num2<30);
        System.out.println(num1>90||num2<30);
        System.out.println(num1!=30);
        //Typecasting
        double num3=num1;
        System.out.println(num3);
        double num4=567354d;
        int num5=(int)num4;
        System.out.println(num5);

        //Math operations
        System.out.println(Math.max(23,87));
        System.out.println(Math.min(23,34));
        System.out.println(Math.sqrt(56));
        System.out.println(Math.abs(46547.6));
        System.out.println(Math.random());
    }
}
