package dungeonsandthedamned;

import java.util.Scanner;


public class DiceRoll {
        public static void main(String[] args) {
        int[] stats = new int[6];
        int dice1, dice2, dice3; 

        for(int i=0; i <=5; i++){
            for(int d=0; d<=3; d++){
                dice1=(int)(Math.random()*6+1);
                dice2=(int)(Math.random()*6+1);
                dice3=(int)(Math.random()*6+1);
                stats[i] = dice1 + dice2 + dice3;
            }
        }
        
            System.out.println("Strength: " + stats[0] );
            System.out.println("Dexterity: " + stats[1] );
            System.out.println("Constitution: " + stats[2] );
            System.out.println("Intelligince: " + stats[3] );
            System.out.println("Wisdom: " + stats[4] );
            System.out.println("Charisma: " + stats[5] );
            int preception = (stats[3] + stats[4]) / 2;
            System.out.println("Preception: " + preception);
            
            strengthDamage(stats);
            
    }
        
        public static void strengthDamage(int damage[]){
            Scanner diceSize = new Scanner(System.in);
            System.out.println("Enter the number of sides on the dice");
            
            int size = diceSize.nextInt();
            System.out.println(damage[0] + size);
        }
        
}

