public class Main{
    public static void main(String[]args){
        Car myCar =new Car();

       
        myCar.make="Toyota";
        myCar.color="black";
        myCar.model="corolla";
        myCar.start();
        myCar.accelerate();
        System.out.println(myCar);
        
    }
}