import java.util.Scanner;

public class Main {
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
        System.out.println("You must build a bridge to get across the river. To build a bridge, you have to collect logs around you. Type in a number of logs to collect");
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
        if (checkLogs.equals("good")) {
            System.out.println("nice guess! you collected enough to build the bridge");
        }

        System.out.println("You cross the bridge and come across a cute dog. What will you name the dog?");
        String dogName = scanner.next();
        String named = naming(dogName);

        System.out.println("input the dog's age, but first multiply it by 10");
        int age = scanner.nextInt();
        int secondAge = dogAge(age);
        System.out.println("The dog is named " + dogName + " , and is " + secondAge + " years old. This dog is now yours");

        System.out.println("You must take " + dogName + " on a walk. How many rounds will you walk, input this as a multiple of 4 or divisible by 3");
        int walk = scanner.nextInt();
        String walking = dogWalk(walk);
        if (walking.equals("You lose!")) {
            System.out.println("You lose! This number did not fulfill the conditions. Try again!");
            System.exit(0);
        }
        System.out.println("Great! Quick thinking!");
        System.out.println("you run into a family member in the jungle. They ask you how many miles have you walked? You don't want this family member to tell the rest of your family how little you actually walked");
        System.out.println("you tell them that you walked 2 miles more than you actually did");
        int miles = scanner.nextInt();
        int milesWalked = milesToWalk(miles);
        System.out.println("you say you walked " + miles + " miles, but you actually only walked " + milesWalked + " miles");
        String ending = end();

        System.out.println("did you enjoy this game? input yes or no");
        String finish = scanner.next();
        String done = enjoyed(finish);
        if(done.equals("no")){
            System.out.println("wrong answer");
            System.exit(0);
        }

        String reallyEnd = program();
        System.exit(0);





    }


    //method monkey1
    public static String name(String name) {
        return ("Hello " + name + "!");
    }

    //method checkRelax
    public static String checkRelax(String relax) {
        if (relax.equals("relax")) {
            return "correct!";
        } else {
            return "Sorry :(";

        }

    }

    //method collectLogs
    public static String collectLogs(int logs) {
        if (logs >= 9 && logs < 30) {
            return "good";
        }
        if (logs < 9) {
            return "Oh No!";

        } else return "OOPS!";
    }

    //method naming
    public static String naming(String dogName) {
        System.out.println("Great! the dog is now named " + dogName);
        return dogName;
    }

    //method dogAge
    public static int dogAge(int age) {

        return (age / 10);
    }

    //method dogWalk
    public static String dogWalk(int walk) {
        int divByFour = walk % 4;
        int timeByThree = walk % 3;
        if (divByFour == 0 || timeByThree == 0) {
            return "Nice!";
        }
        return "You lose!";
    }

    //method milesToWalk
    public static int milesToWalk(int miles) {
        return (miles - 2);
    }

    //method end
    public static String end(){
        System.out.println("congratulations, you made it to the end!");
        return null;
    }

    //method enjoyed
    public static String enjoyed(String finish){

        if(finish.equals("yes")){
            System.out.println("correct!");
            return "yes";

        }

        System.out.println("wrong!");
        return "no";
    }

    //method program
    public static String program() {
        int time = 10;
        System.out.println("your dog is now " + time * 2 + " years old!");
        return "10";
    }




}
