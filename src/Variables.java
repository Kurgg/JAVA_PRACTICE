public class Variables {
    public static void main(String[] args) {
      //Here I took a look on variables and the advanced use of it
      String name = "Kurg";
      System.out.println("Hello " + name);
      //And now a quick way to add family names
      String first = "Mark ";
      String fullname = first + name;
      System.out.println(fullname);
      //And now with math as well
      int x = 5, y = 12;
      //Set everything to the same value
      x = y = 20;
      System.out.println(x + y);
      //"It is reccommended to use descriptive names for variables" - W3
      byte bit = 100;
      System.out.println(bit);
      //--Floating Point Typess
      float num1 = 57e5 f; //e Indicates the power of 10, aka 10 times 5
      double num2 = 12.87 d;
      System.out.println(num1);
      System.out.println(num2);
      //With "char" values, you can also use ASCII values
      

      //--IF STUFF
      //&& - true if both are true
      //|| If one is true
      //! if false then true (!(x < 5 && x < 10))


      //-- STRING LENGTH
      String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      System.out.println("The length of the text is: " + txt.length());
      //Setting letters to upper and lower cases
      System.out.println(txt.toUpperCase());
      System.out.println(txt.toLowerCase());
      System.out.println(txt.indexOf("C"));
      String txt2 = "I am a \"Warrior\" from the west"; // \" for double \' for single
      System.out.println(txt2);

      //-- JAVA MATH
      Math.max(5, 100); //Finds the biggest number inbetween the 2 given valuables
      Math.min(5, 100);
      Math.sqrt(10); //Finds the square root of the said number
      Math.abs(-4.7); //turns negative into positive
      Math.random(); //Random number between 0 and 1
      int randomNum = (int)(Math.random() * 101); //Random number inbetween 0 and 100

      //-- JAVA BOOTLEANS
      int x2 = 10;
      System.out.println(x2 == 10); //Should bring the results in being true
  
    }
  }