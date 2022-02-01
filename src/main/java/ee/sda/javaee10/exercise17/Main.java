package ee.sda.javaee10.exercise17;

public class Main {

    public static void main(String[] args) {

        MeasurementConverter mc = new MeasurementConverter();
        double miles = mc.convert(5, ConversionType.KILOMETERS_TO_MILES);

        System.out.println(5 + " kilometers " + "is " + miles + " miles.");


    }
}
