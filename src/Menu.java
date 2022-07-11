import java.util.Scanner;

public class Menu {
  

  static void showMenu() {
    char option;
    Scanner scanner = new Scanner(System.in);

      do {
          
          System.out.println("What do you want?");
          System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
          
          System.out.println("A: Booking");
          System.out.println("B: Check your reservation");
          System.out.println("C: Exit");

          option = scanner.next().toLowerCase().charAt(0); 

          App.clrscr();

          switch (option) {
            case 'a':
                AirlineBooking.Booking();

                break;

            case 'b':
                System.out.println("--------------------------------------");
                System.out.println("Check your reservation");
                System.out.println("--------------------------------------");
                System.out.println("\n");

                System.out.println(" ----Your reservaiton---- " );
                AirlineBooking.printSeats();
                System.out.println("--------------------------------------\n\n");
                break;

            case 'c':
            
              System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
            break;
            
            
            default:
                System.out.println("What are you doing? plese try again.");
                break;
        }
      }while (Character.toLowerCase(option) != 'c');
      System.out.println("Hava a nice day!!");
      System.exit(option);
      scanner.close();
  } 
}
