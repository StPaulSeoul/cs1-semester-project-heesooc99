package Project;
import java.util.Scanner;

import Project.TVRemote;
public class TVRemoteMain {
	 public static void main(String [] args){
		 TVRemote button = new TVRemote();
	        Scanner console = new Scanner(System.in);
	        int order = 0;
	        int num;
	        int cnt = 1;
	        System.out.printf("You are on Channel number %d\n", button.x);
	        do{
	            System.out.printf("#%d : Make an order (0: Turn of the TV, 1: Change the Channel, 2: What channel am I on? 3: Increase the Volume , 4: Decrease the Volume ) : ", cnt);
	            order = console.nextInt();
	            if(order == 1) {
	                System.out.print("What Channel do you want? : ");
	                num = console.nextInt();
	                button.putNum(num);
	                System.out.println("Channel successfully Changed.");
	            } else if(order == 2){
	                System.out.printf("You are on Channel %d\n", button.returnNum());
	            } else if(order == 3){
	                button.IncreaseVolumeButton();
	            } else if(order == 4){
	                button.DecreaseVolumeButton();
	            }
	        } while(order != 0);
	    }

}
	 


