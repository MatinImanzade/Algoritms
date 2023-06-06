package hackerrank;

public class ReturnSumString {
    public static void main(String[] args) {

        System.out.println(sum1("123", "123"));
    }

    public static String sum(String val1, String val2) {

        String sum = "";
        //val1 = "100";
        //val2 = "100";

        for (int i = 0; i < val1.length(); i++) {
            if (val1.length() - 1 >= 9) {

            }
        }

        return sum;
    }


    public static String sum1(String val1, String val2) {
        StringBuilder result = new StringBuilder();

        //val1 = 123
        //val2 = 123
        int carry = 0;
        int i = val1.length() - 1;
        int j = val2.length() - 1;

        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) {
                sum += val1.charAt(i--) - '0';
            }

            if (j >= 0) {
                sum += val2.charAt(j--) - '0';
            }

            result.append(sum % 10);
            carry = sum / 10;
        }

        if (carry != 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }
}
