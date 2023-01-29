package instruction.generator.real;

/**
 * For converting to fraction
 */
public class RealUtils {

    public static int[] convertToFraction(int a, int b) {
        return doubleToFraction(Double.parseDouble(String.format("%s.%s", a, b)));
    }

    private static int[] doubleToFraction(double x) {
        var stringNumber = String.valueOf(x);
        int numberDigitsDecimals = stringNumber.length() - 1 - stringNumber.indexOf('.');
        int denominator = 1;

        for (int i = 0; i < numberDigitsDecimals; i++) {
            x *= 10;
            denominator *= 10;
        }

        int numerator = (int) Math.round(x);
        int gcf = gcf(numerator, denominator);

        return new int[]{numerator / gcf, denominator / gcf};
    }

    private static int gcf(int num, int denom) {
        if (denom == 0) {
            return num;
        }
        return gcf(denom, num % denom);
    }
}
