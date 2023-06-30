package Arithmetics.CalculateSumOfSquaresOfTheDigits;

class Solution {
    public int squareOfDigits(int n) {
        // Compute the sum of the squares of the digits of n!
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}