public class Main {
    public static void main(String[] args) {

        SpeedConverter.calculateMilesPerHour(10.5);
        boolean value = SpeedConverter.areEqualByThreeDecimalPlaces(12.345, 12.3456);
        System.out.println("It compares two numbers based on three digits" +
                " and return true if th");
        System.out.println("Value of the two numbers is " + value);
    }
}
