import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Welcome to the jungle. Your task is to bypass the animals and complete the game without losing");
        System.out.println("please enter your name to begin");
        String theName = scanner.next();
        String firstName = name(theName);
        System.out.println(firstName);
        System.out.println("A monkey is staring at you, suspicious. The monkey reaches out a hand. To shake it, press 1. To not shake it, press 0 ");
        int monkey = scanner.nextInt();
        if (monkey == 1) {
            System.out.println("sorry :( you lose");
            System.exit(0);
        } else if (monkey == 0) {
            System.out.println("Congrats, you get to keep going! Press 2 to continue");
        }
        monkey = scanner.nextInt();
        if (monkey == 2) {
            System.out.println("you keep walking and you run into an angry rhino. To touch the rhino's horn, press 1. To pet the rhino, press 0");
        }

        int rhino = scanner.nextInt();
        if (rhino == 1) {
            System.out.println("sorry haha you lose");
        }
        if (rhino == 0) {
            System.out.println("yay the rhino is appeased and you can continue! press 2 to continue");
        }
        rhino = scanner.nextInt();

        System.out.println("Next, you run into a excited elephant");
        System.out.println("To calm it down, please input a five letter word that starts with 'r' and ends with 'x', and is a synonym with calm down");
        String relax = scanner.next();
        String choice1 = checkRelax(relax);
        if (choice1.equals("Sorry :(")) {
            System.exit(0);
        }

        System.out.println("good job! Now, you continue on your journey as you come across a river.");
        System.out.println("You must build a bridge to get across the river. To build a bridge, you have to collect logs around you. Type in a number of logs to collect.");
        int logs = scanner.nextInt();
        String checkLogs = collectLogs(logs);
        if (checkLogs.equals("Oh No!")) {
            System.out.println("sorry, you didn't collect enough logs, so when you tried to build the bridge, you fell into the river");
            System.exit(0);

        }
        if (checkLogs.equals("OOPS!")) {
            System.out.println("sorry! you collected too many logs. When you tried to build the bridge, the weight made you crash into the river");
            System.exit(0);
        }
        if(checkLogs.equals("good")){
            System.out.println( "nice guess! you collected enough to build the bridge");
        }


    }



    //method monkey1
    public static String name(String name) {
        return ("Hello " + name + "!");
    }

    //method checkRelax
    public static String checkRelax(String relax) {
        if (relax.equals("relax")) {
            return "correct!";
        } else{
            return "Sorry :(";

        }

    }
    public static String collectLogs(int logs){
        if(logs>=9 && logs<30){
            return "good";
        }
        if(logs<9){
            return "Oh No!";

        }
        else return "OOPS!";
    }

}