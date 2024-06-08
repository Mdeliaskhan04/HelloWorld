public class If_Else {
    public static void main(String[] args) {
        //if..else condition
        int Myage=20;
        int VottingAge=18;
        if(Myage>VottingAge)
        {
            System.out.println("I am elligible for votting");
        }
        else
        {
            System.out.println("I am not elligible for votting");
        }
        //else if condition
        /*
        int number=-10;
        if(number>0)
        {
            System.out.println("The number is positive");
        }
        else if(number<0)
        {
            System.out.println("The number is negative");
        }
        else
        {
            System.out.println("The number is zero");
        }

         */
       //Java Short Hand If...Else (Ternary Operator)
       /* int num1=24;
        String age=(num>20)?"I am preparing for attend the job exam":"I am preparing for the admission exam";
        System.out.println(age);
        //Even number or ODD number
        int a=35;
        if(a%2==0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }

        */
      //Grade point
        int number = 76;
        if (number >= 80 && number <= 100) {
            System.out.println("The result is A+");
        } else if (number >= 70 && number < 80) {
            System.out.println("The result is A");
        } else if (number >= 60 && number < 70) {
            System.out.println("The result is A-");
        } else if (number >= 50 && number < 60) {
            System.out.println("The result is B");
        } else if (number >= 40 && number < 50) {
            System.out.println("The result is C");
        } else if (number >= 33 && number < 40) {
            System.out.println("The result is D");
        } else {
            System.out.println("The result is F");
        }//Class Time for nested loop
        float classtime=11f;
        float wakeup=8;
        int bustime=9;
        if(wakeup<=8)
        {
            System.out.println("I will take my breakfast");
            if(bustime<=8)
            {
                System.out.println("I will get the bus");
                if(classtime<=10)
                {
                    System.out.println("I will do my class");
                }
                else {
                    System.out.println("I will not do the class");
                }
            }
            else
            {
                System.out.println("I will miss the bus also class");
            }
        }
        else
        {
            System.out.println("I will miss the bus and do not attend the class");
        }
    }
}
