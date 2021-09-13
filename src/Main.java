public class Main {
    public static void main(String[] args) {
        Elephant nameOne = new Elephant("simbo", 3000, true);
        Elephant nameTwo = new Elephant ("bambo", 4000, false);

        nameOne.print();
        nameTwo.print();
        nameOne.printStomp();
        nameTwo.printStomp();
        nameOne.charge();
        nameTwo.charge();

    }

}
