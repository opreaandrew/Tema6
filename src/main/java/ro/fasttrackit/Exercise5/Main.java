package ro.fasttrackit.Exercise5;

public class Main {
    public static void main(String[] args){
    Bottle bottle1 = new Bottle(2,2,false);
        System.out.println(bottle1.getAvailableLiquid());
        System.out.println(bottle1.open());
        System.out.println(bottle1.drink(1));
        System.out.println(bottle1.close());
        System.out.println(bottle1.getEmptyCapacity());
    }
}
