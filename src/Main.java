public class Main {
    public static void main(String[] args) {
       Bike bikeOne = new Bike("romet", "green", true, 100, 60, 200);
       Bike bikeTwo = new Bike ("kross","blue", true, 120, 70, 210 );
       Bike bikeThree = new Bike ("trek", "dark", false, 100, 50, 70);

       System.out.println(bikeOne);
       System.out.println(bikeTwo);
       System.out.println(bikeThree);

       /*
        System.out.println(bikeOne.brand + " has a height, width and length of: " + (bikeOne.length * bikeOne.height * bikeOne.width) + " cm");
        System.out.println(bikeTwo.brand + " has a height, width and length of: " + (bikeTwo.length * bikeTwo.height * bikeTwo.width) + " cm");
        System.out.println(bikeThree.brand + " has a height, width and length of: " + (bikeTwo.length * bikeTwo.height * bikeTwo.width) + " cm");
        */

        bikeOne.calculate();
        bikeTwo.calculate();
        bikeThree.calculate();


    }
}
