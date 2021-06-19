package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {
        //create two athletes
    	Athlete bob = new Athlete("Bob", 10);
    	Athlete john = new Athlete("John", 15);
        //print their names, bibNumbers, and the location of their race.
    	System.out.println(bob.name);
    	System.out.println(bob.bibNumber);
    	System.out.println(bob.raceLocation);
    	
    	System.out.println(john.name);
    	System.out.println(john.bibNumber);
    	System.out.println(john.raceLocation);
    }
}
