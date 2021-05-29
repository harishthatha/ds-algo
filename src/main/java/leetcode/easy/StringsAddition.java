package leetcode.easy;

public class StringsAddition {
    /// "123" ,"23" sum to = "146" output
    public String addStrings(String num1, String num2) {
        StringBuilder sum = new StringBuilder();
        int num1Length = num1.length() - 1;
        int num2Length = num2.length() - 1;
        int carry = 0;

        while (num1Length >= 0 || num2Length >= 0) {

            int twoSum = (num1Length >= 0 ? num1.charAt(num1Length) - '0' : 0) + (num2Length >= 0 ? num2.charAt(num2Length) - '0' : 0) + carry;
            carry = twoSum / 10;
            sum.append(twoSum % 10);
            num1Length--;
            num2Length--;
        }
        if (carry > 0) sum.append(carry);
        return sum.reverse().toString();
    }
}
