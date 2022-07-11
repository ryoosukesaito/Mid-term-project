import java.util.Scanner;


public class AirlineBooking {
  

    static char[][] seats = { { 'A', 'B', 'C', 'D','E' }, { 'A', 'B', 'C', 'D','E'}, { 'A', 'B', 'C', 'D','E'},
    { 'A', 'B', 'C', 'D','E'}, { 'A', 'B', 'C', 'D','E'}, { 'A', 'B', 'C', 'D','E' }, { 'A', 'B', 'C', 'D','E'}, 
    { 'A', 'B', 'C', 'D','E' } , { 'A', 'B', 'C', 'D','E' } };
    
    
    public static boolean isFull() {
      for (int i = 0; i < seats.length; i++) {
        for (int j = 0; j < seats[i].length; j++) {
          if (seats[i][j] != '-') {
            return false;
				}
			}
		}
		return true;
	}
  



	public static void printSeats() {
    int row = 1;
		for (int i = 0; i < seats.length; i++) {
      System.out.print(row++ + " ");
			for (int k = 0; k < seats[i].length; k++) {
        System.out.printf(seats[i][k] + " ");
			}
			System.out.println();
		}
	}
  
	public static int getIndex(int character) {
    switch (character) {
      case 'A':
			  return 0;
      case 'B':
			  return 1;
		  case 'C':
        return 2;
		  case 'D':
        return 3;
		  default:
        return 4;
    }
  }

  static void Booking() {
    
    Scanner scan = new Scanner(System.in);
    
    App.clrscr();
    System.out.println("--------------------------------------");
    System.out.println("This is a reservation pase");
    System.out.println("--------------------------------------");
    
    while(!isFull()) {
      System.out.println("Press [Enter] key to continue or press [Q] to exit\n");
      Scanner input = new Scanner(System.in);
      
      if (input.nextLine().toLowerCase().equals("q")) {
        System.out.println("Bye !!!");
        System.exit(0);
      }
    
			
      printSeats();
			System.out.println("Please enter seat's row number...");
			int row = 0;
			boolean rowInput = false;
			while (!rowInput) {
        int checkRow = Character.getNumericValue(scan.nextLine().charAt(0));
				if (checkRow >= 1 && checkRow <= 9) {
          row = checkRow;
					rowInput = true;
          
				} else {
          System.out.println("Hey! Enter a number between 1 and 9 !!");
          
				}
			}
      
			
			System.out.println("Please enter a character represents the seat you wish to reserve... ");
			char column = ' ';
			boolean columnInput = false;
			while (!columnInput) {
        char checkColumn = Character.toUpperCase(scan.nextLine().charAt(0));
				if (checkColumn >= 'A' && checkColumn <= 'E') {
          column = checkColumn;
					columnInput = true;
          
				} else {
          System.out.println("Are you kidding me? Enter a seat between A and D !!");
          
				}
			}
      
			
			if (seats[row -1][getIndex(column)] == '-') {
        System.out.println("Oops! The place is already taken, try to take another one.\n\n");
			} else {
        seats[row -1][getIndex(column)] = '-';
				System.out.printf("Your seat " + row + column + " has been reserved successfully.\n\n");
       
        printSeats();
        
				System.out.printf(
          "Do you continue??\n"+
          "Continue: [Enter] or Back to Menu[M]\n");
          
          Scanner ask = new Scanner(System.in);
          if(ask.nextLine().toLowerCase().equals("m")){
            App.clrscr();
           Menu.showMenu();
          }else{
            continue;
          }
          ask.close();
          
        }
        
        
      
      };
      scan.close();
      System.out.println("Sorry..Seats in the plane are full.");
      System.exit(0);
      
    }
  }