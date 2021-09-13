public class Elephant {
    private String name;
    private int weight;
    private boolean isAngry;
    private int stamina  = 100;

    // constructor for name, weight, angry

    public Elephant(String name, int weight, boolean angry) {
    this.name = name;
    this.weight = weight;
    this.isAngry = angry;
    }

    // getter name
    public String getName() {
        return  name;
    }
    //setter name
    public void setName(String name) {
        this.name = name;
    }

    //getter weight

    public int getWeight() {
        return weight;
    }

    //setter weight
    public void setWeight (int weight) {
        this.weight = weight;
    }

    //getter angry
    public boolean getIsAngry() {
        return isAngry;
    }

    //setter angry
    public void setIsAngry (boolean angry) {
        this.isAngry = angry;
    }

    //getter stamina;
    public int getStamina() {
        return stamina;
    }

    //setter stamina
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    /*
    public String toString() {
        return "name: "+name+" weight: "+weight+" is Angry? "+isAngry;
    }
    */

    // print method

    public void print () {
        System.out.println("The elephant is called " + getName() + ". Its weights is " + getWeight() + " kilograms. Its stamina value is " + getStamina() + ".");

        if(getIsAngry() == true) {
            System.out.println("It is very angry!!!");
        } else {
            System.out.println("It is not angry at all.");
        }
    }

    // stomp method

    public int stomp() {
        return (getWeight() * 3) + 300;
    }

    // stomp print

    public void printStomp() {
        System.out.println("The stomping pressure of " + getName() + " is " + stomp());
    }

        // charge method

    public void charge() {
        System.out.println("Yeeha topspeed is " + (100 - (getWeight() / 1000)));
    }


}

