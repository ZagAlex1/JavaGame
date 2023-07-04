package HomeWork;

public class Main {
    public static void main(String[] args) {
        Countryman countryman = new Countryman("Ivan",-8,-9,-1, 2, 2);
        Sniper sniper = new Sniper("Kolya",100,20,5,-1,"Bowl");

        System.out.println(countryman.toString());
        System.out.println(sniper.toString());
//        countryman.setMovePoints(11);
//        System.out.println(countryman.toString());
    }


}
