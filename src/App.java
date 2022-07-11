import java.io.IOException;
import java.util.Scanner;


public class App {

    
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        
        AccountData<String,String> account = new AccountData<>("Taro", "4649");
        clrscr();
        
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
        System.out.println("Welcome to Friendly Airline");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
        
        while(true){
            System.out.println("Please enter your username :)");
            String user = input.nextLine();
            System.out.println("Please enter your password :)");
            String pass = input.nextLine();
            
            if(user.equals(account.getCustomerName()) && pass.equals(account.getCustomerPassword())){
                clrscr();
                System.out.println("Hi  " + account.getCustomerName() + "!!");
                break;
            }
            
            System.out.println(
                "Heyyy Not Correct bro..\n\n"+
                "Press [enter] key to try again or press [Q] to exit\n\n"
                );
                
                if(input.nextLine().toLowerCase().equals("q")){
                    System.out.println("See ya bro !!");
                    System.exit(0);
                }
            }
            Menu.showMenu();
            input.close();

    }
    

    static void clrscr(){
        
        try {
            if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
            Runtime.getRuntime().exec("clear");
            System.out.print("\033\143");
        } catch (IOException | InterruptedException ex) {}
    }
    
}
