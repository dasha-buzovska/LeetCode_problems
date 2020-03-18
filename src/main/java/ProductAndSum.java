/*
* Given an integer number n, return the difference between the product of its
* digits and the sum of its digits.
 * */

public class ProductAndSum {

    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int number = n%10;
            product *= number;
            sum += number;
            n = n/10;
        }
        return product - sum;
    }
}
