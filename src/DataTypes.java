public class DataTypes {
    public static void main(String[] args) {
        int items=50;
        float CostPerItem=9.99f;
        float TotalCost=items*CostPerItem;
        char currency='$';
        System.out.println("Number of items: "+items);
        System.out.println("Cost Per Item: "+CostPerItem + currency);
        System.out.println("Total Cost: "+TotalCost + currency);

        //Booelan Datatypes
        boolean javaIsFun=true;
        boolean javaISFun=false;
        System.out.println(javaISFun);

        int x=100;
        int y=60;
        System.out.println(x==100);

        //problem
        int MyAge=27;
        int VottingAge=18;
        System.out.println(MyAge>VottingAge);
    }
}
