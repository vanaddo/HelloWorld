import javax.jws.soap.SOAPBinding;
import javax.print.DocFlavor;
import java.text.StringCharacterIterator;

public class Dog {

  String name;
  int age;
  String fetchedItems[] = {"Shoe","Homework","Bone"};

  public Dog(String name, int age){
    this.name = name;
    this.age = age;
  }// This is our constructor. How we make dogs

  private int fetchCounter; //initializer where to start

  public int dogYears(){
    return this.age * 7;
  }


  public void dogAttack() {
    System.out.println("Woof!");
  }
  public void fetch(){
    this.fetchCounter = (this.fetchCounter+1)%3;
    String item = this.fetchedItems[this.fetchCounter];
    System.out.println(name + " fetched a "+ item+".");
  }

}
