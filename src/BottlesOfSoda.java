/* 
   11/18/14
   JDK 1.7
   Print 99 bottles of soda song using a loop
 */
public class BottlesOfSoda {
    public static void main(String[] args) {
        for(int n=99; n>0; n--){
            printBottlesVerse(n);
        }
        System.out.println("Go to the store and buy some more, " +
                "\n99 bottles of soda on the wall.\n");
    }
    public static void printBottlesVerse(int n){
        System.out.println(n+" bottles of soda on the wall, " +
                n+ " bottles of soda" +
                "\nTake one down and pass it around, " +
                (n-1) + " bottles of soda on the wall.\n");
    }
}