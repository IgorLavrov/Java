package ee.sda.javaee10.exercise17;

public class MeasurementConverter {

    public double convert(int value, ConversionType conversionType) {

        if (conversionType.equals(ConversionType.INCHES_TO_CENTIMETERS)) {
            return value * 2.54; // 1inch = 2.54cm
        } else if (conversionType.equals(ConversionType.CENTIMETERS_TO_INCHES)) {
            return value * 0.393701; //1cm = 0.393701 inches
        } else if (conversionType.equals(ConversionType.KILOMETERS_TO_MILES)) {
            return value * 0.621371; //1km = 0.621371 miles
        } else if (conversionType.equals(ConversionType.MILES_TO_KILOMETERS)) {
            return value * 1.60934; //1 mile = 1.60934 kilometer
        } else if (conversionType.equals(ConversionType.METERS_TO_YARDS)) {
            return value * 1.09361; //1meter = 1.09361 yards
        } else if (conversionType.equals(ConversionType.YARDS_TO_METERS)) {
            return value * 0.9144; //1 yard = 0.9144 meters;
        } else {
            throw new IllegalArgumentException("No such conversion policy.");
        }
    }

}