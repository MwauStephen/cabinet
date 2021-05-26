package zombie;

public class ZombieKiller{
   public static void main(String[] args) {
	   System.out.println("Welcome to our zombie killer rogram!!!");
	   System.out.println("\t");
	   
	   String weapon[]= {"Short-gun","Assault-rifle","Sniper"};
	   
	   String Zombie[]= {"close-range","Mid-range","Long-range"};
	   
	   
	   System.out.println("Here are the weapons to kill the zombies and their respective distance range");
	  
	   System.out.println(weapon[0] + " "  + "=" +" "+ Zombie[0]);
	   System.out.println(weapon[1] + " " + "=" +" " + Zombie[1]);
	   System.out.println(weapon[2] + " " + "=" + " " + Zombie[2]);
	   
	   
	   System.out.println("\t");
	   System.out.println("These are the zombies to be killed by respective weapons \t");
	   System.out.println(Zombie[0]+"\t");
	   System.out.println(Zombie[1]+"\t");
	   System.out.println(Zombie[2]+"\t");
	   
   }
}