
/*


1. DECORATOR -> to add additional functionality without changing the original structure eg. base pizza then cheese

            prevent from class explosion problem

2. PROXY -> this pattern help to access control to original objects

            client -> proxy -> resource


3. COMPOSITE -> object inside an object eg. file system, delivery box

4. ADAPTER -> This pattern acts a bridge between two incompatible interfaces.

5. BRIDGE -> This pattern helps to decouple an abstraction form its implementation, so that two can vary independently.


6. FACADE -> This pattern helps to hide the system complexity from the client.

7. FLYWEIGHT -> This pattern helps to reduce usage of memory by sharing data among multiple object.


 */

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}