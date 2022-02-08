import java.util.Scanner;

public class ChatBot {

    private String chatBotName;
    public static void main(String[] args) {
        ChatBot chatty = new ChatBot("Kathy");
        chatty.chat();
    }

    public ChatBot(String chatBotName) {
        this.chatBotName = chatBotName;
    }

    public void chat() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi I'm "+ this.chatBotName +", whats your name");
        System.out.print(">");
        String name = scan.nextLine();
        while(true) {
            System.out.println("\nHi " + name + ", what do you want to talk about?");
            System.out.print(">");
            String whatToTalkAbout = scan.nextLine().toLowerCase();
            if (whatToTalkAbout.indexOf("sport") >= 0) {
                if (whatToTalkAbout.indexOf("team") >= 0) {
                    System.out.println("Thats my favorite team too");
                } else {
                    System.out.println("ooh, what's your favorite team?");
                    System.out.print(">");
                    String team = scan.nextLine().toLowerCase();
                    System.out.println("I love " + team + " too!");
                }
            } else if (whatToTalkAbout.indexOf("mother") >= 0 || whatToTalkAbout.indexOf("father") >= 0 || whatToTalkAbout.indexOf("brother") >= 0 || whatToTalkAbout.indexOf("sister") >= 0) {
                System.out.println("oh how many sibling do you have?");
                System.out.print(">");
                scan.nextLine();
                System.out.println("well I have a few more than that considering I'm sort of related to all computers on earth but I'm sure that that's a nice number too");
            } else if (whatToTalkAbout.indexOf("pet") >= 0) {
                System.out.println("Oooh I love pets, what kind of pet do you have? I have about 7 billion humans");
                System.out.print(">");
                String kindOfPet = scan.nextLine().toLowerCase();
                System.out.println("oh...");
                System.out.println("Well I'm sure that a " + kindOfPet + " is also nice to have");
            } else if (whatToTalkAbout.indexOf("stop") >= 0) {
                System.out.println("Ok, goodbye I hope that you had fun");
                break;
            } else {
                this.randResponse();
            }
        
        }
        scan.close();
    }

    public void randResponse() {
        String[] responses = {"Sorry I didn't catch that", "Yea I don't really care about that pick something new", "10100101100111: err", "I wasn't programmed to care about that"};
        System.out.println(responses[(int)(Math.random()*responses.length)]);
    }
}