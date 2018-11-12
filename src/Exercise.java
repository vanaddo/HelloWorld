class Exercise {

  /*
  Write a method called exponent(int base, int exp) that returns an int value of base raises to the power of exp. The signature of the method is:

  public static int exponent(int base, int exp);
  Assume that exp is a non-negative integer and base is an integer. Do not use any Math library functions.

  Also write the main() method that prompts user for the base and exp; and prints the result. For example,

  Enter the base: 3
  Enter the exponent: 4
          3 raises to the power of 4 is: 81
*/

  static int exponent(int base, int exp) {
    int product = 1; //you want to start your product/total at 1 cause if you start at 0 and multiply by each iteration you'd get 0. Same with
    for (int i = 1; i <= exp; i++) {
      product *= base;
    }

    return product;
  }

  //Find the average of 3 numbers
  static int avgOfNums(int num1, int num2, int num3) {

   return (num1 + num2 + num3) / 3;

  }

  //Write a Java program to accepts an integer and count the factors of the number.
   static int factors(int num) {
    int result = 0;

    for (int i = 1; i <= (int) Math.sqrt(num); i++) {


      if (num % i == 0 && i * i != num) {

        result += 2;
      } else if (i * i == num) {

        result++;

      }
    }
    return result;
  }

  //Write a boolean method called isOdd() in a class called OddEvenTest, which takes an int as input and returns true if the it is odd.
  static boolean isOdd(int number) {
    if (number % 2 == 0) {
      return false;

    } else {return true;}
  }
}
