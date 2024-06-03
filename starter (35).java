/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
System.out.println("THE LIFE DECIDER: ");
		System.out.println("Confused and don't know what to do today?");
		System.out.println("This program will be able to decide for you whenever you have those tough decisions");
		System.out.println("Just choose the letter that corresponds with what you want randomized for you");
		System.out.println("   a. If you want a randomized game");
		System.out.println("   b. If you want a randomized activity irl");
		System.out.println("   c. Quit the LIFE DECIDER!");
		System.out.println("We dont want you to do too many things so we will only allow you to go 10 times :D");
		System.out.println("------------------------------------------------");
		int p = 10;
		
		while(p>0){
			String a = "a";
			String b = "b";
			String c = "c";
			int y;
			int gg;
			int hf;
			int e;
			int q;
			int x;
			int l;
			int k;
			int j;
			int h;
			int g;
			int ll;
		System.out.print("Lets choose a letter for your activity :D : ");
    		Scanner sc = new Scanner(System.in); 
    		String hi = sc.nextLine();
      
      if(a.equals(hi)){
      	//league, valorant, osu, minecraft,fortnite 
      	y = (int) (Math.random()*5+1);
      	
      	if(y==1){
      	
      		System.out.println("You are going to play League of Legends!");
      		l = (int) (Math.random()*5+1);
      		if (l ==1){
      			System.out.println("And you are in the TOP lane");
      		}
      		if (l ==2){
      			System.out.println("And you are in the Mid lane");
      		}
      		if (l ==3){
      			System.out.println("And you are the JUNGLER");
      		}
      		if (l ==4){
      			System.out.println("And you are in the BOTTOM lane");
      		}
      		if (l ==5){
      			System.out.println("And you are the SUPPORT :(");
      		}
      		System.out.println("------------------------------------------------");
      		
      	}
      	
      	if(y==2){
      		System.out.println("You are going to play Valorant!");
      		k = (int) (Math.random()*5+1);
      		
      		System.out.println("------------------------------------------------");
      
      	}
      	
      	if(y==3){
      		System.out.println("You are going to play Osu!");
      			j = (int) (Math.random()*5+1);
      	
      			System.out.println("You will click the random map "+ j +" times");
      		System.out.println("------------------------------------------------");
      	
      	}
      	
      	if(y==4){
      		System.out.println("You are going to play Minecraft!");
      		h = (int) (Math.random()*2+1);
      		if (h==1){
      		System.out.println("You will play survival");
      		}else if (h==2){
      		System.out.println("You will play online");
      		ll = (int) (Math.random()*4+1);
      		if (ll==1){
      			System.out.println("And the server will be Hypixel");
      		}else if (ll==2){
      			System.out.println("And the server will be Complex Gaming");
      		}else if (ll==3){
      			System.out.println("And the server will be Akuma MC");
      		}else if (ll==4){
      			System.out.println("And the server will be Minemen");
      		}
      			
      		}
      		System.out.println("------------------------------------------------");
      		
      	}
      	
      	if(y==5){
      		System.out.println("You are going to play Fortnite!");
      		g = (int) (Math.random()*5+1);
      		if (g==1){
      			System.out.println("You are going to play Solos");
      		}else if (g==2){
      			System.out.println("You are going to play Duos");
      		}else if (g==3){
      			System.out.println("You are going to play Squads");
      		}else if (g==4){
      			System.out.println("You are going to play Ranked");
      		}else if (g==5){
      			System.out.println("You are going to play Creative");
      		}
      		System.out.println("------------------------------------------------");
      		
      	}
      	
      }
      //order takeout and eat, exercise, make food and eat, take a nap, chug a water
        if(b.equals(hi)){
      	x = (int) (Math.random()*5+1);
      	if (x==1){
      		System.out.println("You are going to order takeout");
      		e = (int) (Math.random()*5+1);
      			if (e==1){
      			System.out.println("get sum Mcdonalds");
      			System.out.println("------------------------------------------------");
      		}else if (e==2){
      			System.out.println("get sum dave hot chicken");
      			System.out.println("------------------------------------------------");
      		}else{
      			System.out.println("get sum chipotle");
      			System.out.println("------------------------------------------------");
      		}
      	}
      	if (x==2){
      		System.out.println("You are going to exercise >:)");
      		e = (int) (Math.random()*3+1);
      		if (e==1){
      			System.out.println("Its a push day");
      			System.out.println("------------------------------------------------");
      		}else if (e==2){
      			System.out.println("Its a pull day");
      			System.out.println("------------------------------------------------");
      		}else{
      			System.out.println("You are hitting legs");
      			System.out.println("------------------------------------------------");
      		}
      	}
      	if (x==3){
      		System.out.println("You are going to make food yourself");
      		e = (int) (Math.random()*3+1);
      		if (e==1){
      			System.out.println("Make instant ramen");
      		
      		}else if (e==2){
      			System.out.println("SIKE DONT EAT HAHAHHA");
      			
      		}else{
      			System.out.println("Make some chicken n rice");
      		}
      		System.out.println("------------------------------------------------");
      	}
      	if (x==4){
      		System.out.println("You are going to take a nap");
      		gg = (int) (Math.random()*3+1);
      		if (gg==1){
      			System.out.println("Just sleep more");
      			System.out.println("------------------------------------------------");
      		}else if (gg==2){
      			System.out.println("Take a 2 hr nap");
      			System.out.println("------------------------------------------------");
      		}else{
      			System.out.println("Take a 1 minute power nap");
      			System.out.println("------------------------------------------------");
      		}
     
      	}
      	if (x==5){
      		System.out.println("You are going to chug a water");
      		hf = (int) (Math.random()*3+1);
      		if (hf==1){
      			System.out.println("Chug a whole bottle");
      			System.out.println("------------------------------------------------");
      		}else if (hf==2){
      			System.out.println("Chug for 10 seconds");
      			System.out.println("------------------------------------------------");
      		}else{
      			System.out.println("Chug for 20 seconds");
      			System.out.println("------------------------------------------------");
      		}
      		
      	}
      }
      
        if(c.equals(hi)){
      	p=0;
      }
      
        if(!a.equals(hi)&&!b.equals(hi)&&!c.equals(hi)){
		System.out.println("not a valid letter choose agane");
		System.out.println("------------------------------------------------");
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      p--;
		}
		System.out.println("------------------------------------------------");
		System.out.print("Thanks! now get some rest :joy:");
	}
}
