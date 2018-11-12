import javax.sound.midi.Soundbank;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

/* Car myCar = new Car(25.5,
         "1BC32E",
          Color.BLUE,
          true);

    Car sallyCar = new Car(13.9,
            "3D20BN",
            Color.BLACK,
           false);
    System.out.println("My Car's License Plate: " + myCar.licensePlate);
  System.out.println("My Car's License Plate: " + sallyCar.licensePlate);
    System.out.println(sallyCar.paintColor.toString());
    myCar.changePaintColor(Color.RED);
   System.out.println(myCar.paintColor.toString());

   double myCarSpeed = 50;
    myCarSpeed = myCar.speedingUp(myCarSpeed);
    System.out.println(myCarSpeed);*/




    /*System.out.println("Enter a word");
    Scanner sc = new Scanner(System.in);


    String userInput = sc.next();

    String uppercased= userInput.toUpperCase();
    System.out.println(userInput);
    System.out.println(uppercased);

    char firstCharacter = userInput.charAt(0);
    System.out.println(firstCharacter);
    System.out.println("Contains: " + userInput.contains("Enter".toLowerCase()));
*/

   /* int[] numbers = new int[5]; //sets the size of the array
    numbers[0] = 31;
    numbers[1] = 45;
    numbers[2] = 22;
    numbers[3] = 98;
    numbers[4] = 10;

    int[] numbers2 = {31,45,22,98,10}; //this declares, allocates, & initializes array in one line
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));

    String [] myFavoriteCandyBars = {"Twix", "Hershey's", "Crunch"};
    System.out.println("Index 1: " + myFavoriteCandyBars[1]);
    myFavoriteCandyBars[2] = "Butterfinger";
    System.out.println("Index 2; " + myFavoriteCandyBars[2]);
    System.out.println("Length: " + myFavoriteCandyBars.length);

    System.out.println(Array.get(myFavoriteCandyBars, 2));
*/

 /*  String s = "dog";
   String replacedF = s.replace('d', 'f');
    System.out.println(replacedF);
    */

   /*   Dog topDog = new Dog("Tom", 2);

      Dog puppyDog = new Dog("Sal",1);

      int dogYears = topDog.dogYears();
    System.out.println(topDog.name + " is " + topDog.dogYears() +" years old in dog years.");
    System.out.println(puppyDog.name + " is " +  puppyDog.dogYears() +" years old in dog years.");
    puppyDog.fetch();
    topDog.fetch();
    puppyDog.dogAttack();
    */

    /*System.out.println("Enter an age: ");
    Scanner in = new Scanner(System.in);
    int age = in.nextInt();

    if (age >= 0 && age <= 5) {
      System.out.println("Baby");
    } else if (age >= 6 && age <= 11) {
      System.out.println("Kid");
    } else if (age >= 12 && age <= 17) {
      System.out.println("Teen");
    } else if (age >= 18) {
      System.out.println("Adult");
    }else {
      System.out.println("Invalid");
    }
    System.out.println("Thanks for using this program!");
    */
  /*  System.out.println("This is a visual example of a WHILE LOOP");
    int x =3;

    while (x > 0){
      System.out.println("Current x: "+ x);
      x = x-1;
    }

    System.out.println("Final x: " + x);
    System.out.println();
*/
    /*System.out.println("This is a visual example of a DO WHILE LOOP");
    int y = 3;
    do{
      System.out.println("Current y : " +y);
      y = y-1;
    } while (y >0);
    System.out.println("Final y: "+y);
    System.out.println();
    */

    //Call exercises
/*    System.out.println("Start!");

    checkIfOdd();

    System.out.println("\n ---------------------------------------------------- ");

    findNumOfFactors();
    System.out.println("\n ----------------------------------------------------");

    findTheAverage();
    System.out.println("\n ----------------------------------------------------");

    findExponent();
    System.out.println("\n...End. Bye Bye!");
    */


    System.out.println("Select an exercise:");
    System.out.println("\n Odd");
    System.out.println("\n Factor");
    System.out.println("\n Average");
    System.out.println("\n Exponent");

    Scanner in = new Scanner(System.in);
     String input = in.next();
     String solution = input.toLowerCase();

     switch (solution){
       case "factor":
         findNumOfFactors();
         break;
       case "average":
         findTheAverage();
        break;
       case "odd":
         checkIfOdd();
         break;
       case"exponent":
         findExponent();
         break;
       default:
         System.out.println("Please pick an option");


     }


  }

  public static void checkIfOdd(){

    System.out.println("Enter a number to see if it's even or odd:  ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    boolean odd = Excercise.isOdd(number);

    if(odd){
      System.out.printf("%d is an odd number.",number);
    }
    else {
      System.out.printf("%d is an even number.",number);
    }
  }

public static void findNumOfFactors(){
  System.out.println("Enter a number to find the number of factors.");
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();

  int numOfFactors =  Excercise.factors(num);

  System.out.printf("%d has %d factors,", num, numOfFactors);
}

public static void findTheAverage(){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter 3 numbers to get their average :");
  System.out.println("Input 1");
  int num1 = sc.nextInt();
  System.out.println("Input 2");
  int num2 = sc.nextInt();
  System.out.println("Input 3");
  int num3 = sc.nextInt();

  int average = Excercise.avgOfNums(num1,num2,num3);

  System.out.printf("The average of %d, %d, & %d is %d.",num1,num2,num3,average);
}

public static void findExponent(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the base: ");
    int base = sc.nextInt();
    System.out.println("Enter the exponent: ");
    int exp = sc.nextInt();

    int toThePowerOf = Excercise.exponent(base,exp);

    System.out.printf("%d raised to the power of %d is : %d", base, exp, toThePowerOf);

  }
}
