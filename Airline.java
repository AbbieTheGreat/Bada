import java.io.IOException;
import java.util.*;

public class Airline {
    public static void main(String args[] ) throws IOException, InterruptedException{
        System.out.println("__________________________________________________________");
        System.out.println("\n\t*WELCOME TO CIT AIRLINES SEAT RESERVATION*\n");
        System.out.println("__________________________________________________________"); 
               
        Scanner scan = new Scanner(System.in);
        ArrayList<String> placelist = new ArrayList<String>();
        placelist.add("Seat NOt");
        placelist.add("Seat Available");
        placelist.add("Seat Available");
        placelist.add("Seat Available");

        boolean isContinue=true;
        
        while (isContinue) {
            System.out.println("\n\t\t[1]Seat Arrangements\n");
            System.out.println("\n\t\t[2]Seat Reservation\n");
            System.out.println("\n\t\t[3]Cancel Seat Reservation\n");
            System.out.println("\n\t\t[4]Exit\n");
            
            byte option=0;
            System.out.print("\nSelect: ");
          
            option=scan.nextByte();
            
            switch (option){
	               
                case 1:
                	System.out.println("\nAirplane Seats Arrangements");
                	
                		for(int i=0;i<placelist.size();i++){
                		      	
                        	System.out.printf("(%d)%s\n",i+1,placelist.get(i));
                    		}

                System.out.println("\n" + "Press enter to back...");
                try{
                    System.in.read();
                }  
                catch(Exception e){}

                break;
                
                case 2: 
                    char option1='y';
                    int o,p;
                    System.out.println("\nAvailable Seats");
                   
                    for(int i=0;i<placelist.size();i++){
                        System.out.printf("(%d)%s\n",i+1,placelist.get(i)); }
               
                        do{
                    		System.out.print("\nWhich seat do you want to reserved? ");
                    		 
                    		p=scan.nextInt();
                    		o=p-1;
                   		placelist.set(o,"RESERVED");
                    		 
                            System.out.print("\nCongrats! Your seat is valid and reserved for you!");
                    		System.out.println("\nAirplane Seats");
                    		for(int i=0;i<placelist.size();i++){
                        		System.out.printf("(%d)%s\n",i+1,placelist.get(i));
                    			}

                       	System.out.println("\nDo you want to reserved another seats?  [y|n]: ");
                    		option1=scan.next().charAt(0);
                    		} while
                    			(option1=='y');                
                                break;
              
                case 3:
                    char option2='y';
                    int s,t;
                    System.out.println("\nAvailable Seats");
                    for(int i=0;i<placelist.size();i++){
                        System.out.printf("(%d)%s\n",i+1,placelist.get(i)); }
                
                    do{
                    		System.out.print("Which seat reservation do you want to cancel? ");
                    		t=scan.nextInt();
                    		s=t-1;
                            placelist.set(s,"Seat Available");
                    	
                        System.out.print("\nYou have successfully cancelled your seat reservation");
                 
                    			System.out.println("\nAirplane Seats");
                    		for(int i=0;i<placelist.size();i++){
                        System.out.printf("(%d)%s\n",i+1,placelist.get(i));
           		         }

                      System.out.println("\nDo you want to cancel another seat reservation?  [y|n]: ");
                    	option2=scan.next().charAt(0);
                    	} while
                    		(option2=='y');
                        break;
                
                case 4: 
                    System.out.println("\n\n\tTHANK YOU FOR CHOOSING CIT AIRLINES.");
                 	isContinue=false;
                    System.out.println();
                    break; 
                
                default:
                    System.out.println("Invalid Selection");
              }          
          } 
      }
   }