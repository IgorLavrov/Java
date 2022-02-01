package ee.sda.javaee10.exercise16;

enum Runner {

    BEGINNER(0, 10),
    INTERMEDIATE(11, 30),
    ADVANCED(31,60);

    private int min;
    private int max;

    Runner(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static Runner getFitnessLevel(int minutes) {
        if (minutes >= 0 && minutes <= 10) { //[0, 10]
            return BEGINNER;
        } else if (minutes > 10 && minutes <= 30) {
            return INTERMEDIATE;
        } else if (minutes > 30 && minutes <= 60) {
            return ADVANCED;
        } else {
            throw new IllegalArgumentException("Wrong time provided.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Runner runnersLevel = Runner.getFitnessLevel(12);


    }
}
