package Challenge30DaysOfCode.Person;

public class Person {
    private int age;

    public Person(int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge >= 0) {
            age = initialAge;
        } else {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        String s;
        if (age < 13) {
            s = "You are young.";
        } else if (age >= 13 && age < 18) {
            s = "You are a teenager.";
        } else {
            s = "You are old.";
        }
        System.out.println(s);
    }

    public void yearPasses() {
        // Increment this person's age.
        age++;
    }

    public static void main(String[] args) {

    }
}
