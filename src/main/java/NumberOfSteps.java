/*
* Given a non-negative integer num, return the number of steps to
* reduce it to zero. If the current number is even, you have to divide
* it by 2, otherwise, you have to subtract 1 from it.
*/

public class NumberOfSteps {

    public int numberOfSteps (int num) {
        int result = 1;
        while (num != 1) {
            result += 1 + num%2;
            num = num/2;
        }
        return result;
    }

}
