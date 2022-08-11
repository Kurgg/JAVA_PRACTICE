public class Variables {
        public static void main(String[] args) {
            //Here I took a look on variables and the advanced use of it
            String name = "Kurg";
            System.out.println("Hello "+ name);
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
            float num1 = 57e5f; //e Indicates the power of 10, aka 10 times 5
            double num2 = 12.87d;
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
    }
}
