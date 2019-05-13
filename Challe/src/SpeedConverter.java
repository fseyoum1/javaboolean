public class SpeedConverter {
    public static  long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour/1.609);

    }

    public static void calculateMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid value, please use a positive value.");
        } else {
            long inMiles = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + inMiles);
        }
    }


    public static boolean areEqualByThreeDecimalPlaces(double v1, double v2) {
        int value1 = (int) (v1 * 1000);
        int value2 = (int)(v2 * 1000);
        if (value1 == value2) {
            return true;
        } else {
            return false;
        }
    }


}
