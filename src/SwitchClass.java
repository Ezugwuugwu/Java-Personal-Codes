import java.util.Scanner;

public class SwitchClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String format = """
                press 1 for phonebook
                press 2 for messages
                press 3 for chat
                press 4 for call register
                press 0 to exit
                """;
        System.out.println(format);
        System.out.println("Enter any numbers above to proceed");
        int number = input.nextInt();
        switch (number){

            case 1:
                String book = """
                press 1 to search
                press 2 for service nos
                press 3 to select other sub options
                press 4 to erase
                press 5 to assign tone
                press 6 send birthday card
                        """;
                    System.out.println(book);
                    System.out.println("Select any of the numbers above to proceed");
                    int phonebpook = input.nextInt();

                    switch (phonebpook){
                        case 1:
                            System.out.println("You are using the search box");
                            break;
                        case 2:
                            System.out.println("you are in for service nos");
                            break;
                        case 3:

                            String options = """
                                    Enter 1 for type of view
                                    Enter 2 for message validity
                                    """;
                            System.out.println(options);
                            System.out.println("enter any of the number above to proceed");
                            int opt = input.nextInt();

                                switch (opt){
                                    case 1:
                                        System.out.println("You are in the type of view");
                                        break;

                                    case  2:
                                        System.out.println("You want to check your memory status");
                                }
                    }
                break;

            case 2:
                String message = """
                press 1 to write message
                press 2 to check inbox
                press 3 for picture messages
                        """;
                System.out.println(message);
                System.out.println("Select any of the numbers above to proceed");
                int mess = input.nextInt();

                        switch (mess){
                            case 1:
                                System.out.println("Now u can write your texts messages");
                                break;

                            case 2:
                                System.out.println("Yoiur inbox is empty");
                                break;
                            case 3:
                                System.out.println("send pictures as message");
                        }
                      break;

            case 3:
                System.out.println("This is simply your chat platform. You can start messaging your contacts");
                break;
            case 4:
                String call = """
                press 1 to check missed calls
                press 2 to view receieved calls
                press 3 to see dialed numbers
                        """;
                System.out.println(call);
                System.out.println("Select any of the numbers above to proceed");
                int callReg = input.nextInt();
                        switch (callReg){
                            case 1:
                                System.out.println("You have no missed calls");
                                break;
                            case 2:
                                System.out.println("You received calls from 2 persons");
                                break;
                            case 3:
                                System.out.println("You didn't dial any number");

                        }

                break;

            default:
                System.out.println("You hav entered wrong number\nPlease check and enter the correct number");

            case 0:
                System.exit(0);



        }
    }
}
