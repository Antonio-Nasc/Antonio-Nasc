
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int decimal = 0;
        
        System.out.println("decimal: ");
        decimal = input.nextInt();
        
        System.out.println("romano: ");
        if(decimal == 1) 
        {
            System.out.println("I");
        }
        
        if((decimal > 1) && (decimal < 4))
        {
            for(int i = 0; i < decimal; i++)
            {
                System.out.print("I");
            }
            System.out.println();
        }        
                
        if((decimal > 3) && (decimal <= 5))
        {        
            for(int i = 0; i < (5 - decimal); i++) {
                System.out.print("I");
            }
            System.out.println("V");
        }
        
        if((decimal > 5) && (decimal < 9)) 
        {
            System.out.print("V");
            for(int i = 0; i < (decimal - 5); i++)
            {                
                System.out.print("I");
            }
            System.out.println();
        }
        
        if((decimal > 8) && (decimal <= 10))
        {            
            for(int i = 0; i < (10 - decimal); i++) {
                System.out.print("I");
            }
            System.out.println("X");
        }
        
        
        if((decimal > 10) && (decimal < 14))
        {
        	System.out.print("X");
            for(int i = 0; i < (decimal - 10); i++)
            {
                System.out.print("I");
                
            }
            System.out.println();
        }        
                
        if((decimal > 13) && (decimal <= 15))
        {
        	System.out.print("X");
            for(int i = 0; i < (15 - decimal); i++) {
                System.out.print("I");
            }
            System.out.println("V");
        }
        
        if((decimal > 15) && (decimal < 19))
        {
        	System.out.print("X");
        	System.out.print("V");
            for(int i = 0; i < (decimal - 15); i++)
            {
                System.out.print("I");
                
            }
            System.out.println();
        } 
        
        if((decimal > 18) && (decimal <= 20))
        {
        	System.out.print("X");
            for(int i = 0; i < (20 - decimal); i++) {
                System.out.print("I");
            }
            System.out.println("X");
        }
        
        if((decimal > 20) && (decimal < 24))
        {
        	System.out.print("X");            
            System.out.print("X");
            for(int i = 0; i < (decimal - 20); i++) {
                System.out.print("I");
            }
            System.out.println();
        }
        
        if((decimal > 23) && (decimal <= 25))
        {
        	System.out.print("X");
        	System.out.print("X");
            for(int i = 0; i < (15 - decimal); i++) {
                System.out.print("I");
            }
            System.out.println("V");
        }
        if((decimal > 25) && (decimal < 29))
        {
        	System.out.print("X");
        	System.out.print("X");
        	System.out.print("V");
            for(int i = 0; i < (decimal - 25); i++) {
                System.out.print("I");
            }
            System.out.println();
        }
        
        if((decimal > 28) && (decimal <= 30))
        {
        	System.out.print("X");
        	System.out.print("X");
            for(int i = 0; i < (30 - decimal); i++) {
                System.out.print("I");
            }
            System.out.println("X");
        }
        
        if((decimal > 30) && (decimal < 34))
        {
        	System.out.print("X");
        	System.out.print("X");
        	System.out.print("X");
            for(int i = 0; i < (decimal - 30); i++) {
                System.out.print("I");
            }
            System.out.println();
        }

        if((decimal > 33) && (decimal <= 34))
        {
        	System.out.print("X");
        	System.out.print("X");
        	System.out.print("X");
            for(int i = 0; i < (decimal - 33); i++) {
                System.out.print("I");
            }
            System.out.println("V");
        }
        
        if((decimal > 34) && (decimal < 39))
        {
        	System.out.print("X");
        	System.out.print("X");
        	System.out.print("X");
        	System.out.print("V");
            for(int i = 0; i < (decimal - 35); i++) {
                System.out.print("I");
            }
            System.out.println();
        }
        
        if((decimal > 38) && (decimal <= 39))
        {
        	System.out.print("X");
        	System.out.print("X");
        	System.out.print("X");
            for(int i = 0; i < (decimal - 38); i++) {
                System.out.print("I");
            }
            System.out.println("X");
        }
        
        if(decimal == 40) {
            System.out.println("XL");
        }
        
        if((decimal > 40) && (decimal < 44))
        {
        	System.out.print("X");
        	System.out.print("L");        	
            for(int i = 0; i < (decimal - 40); i++) {
                System.out.print("I");
            }
            System.out.println();
        }
        
        if((decimal > 43) && (decimal <= 44))
        {
        	System.out.print("X");
        	System.out.print("L");        	
            for(int i = 0; i < (decimal - 43); i++) {
                System.out.print("I");
            }
            System.out.println("V");
        } 
        
        if((decimal > 44) && (decimal < 49))
        {
        	System.out.print("X");
        	System.out.print("L");
        	System.out.print("V");
            for(int i = 0; i < (decimal - 45); i++) {
                System.out.print("I");
            }
            System.out.println();
        } 
        
        if((decimal > 48) && (decimal <= 49))
        {
        	System.out.print("X");
        	System.out.print("L");        	
            for(int i = 0; i < (decimal - 48); i++) {
                System.out.print("I");
            }
            System.out.println("X");
        } 
        
        if(decimal == 50) {
            System.out.println("L");
        }
        
        if(decimal == 100) {
            System.out.println("C");
        }
        
        if(decimal == 500) {
            System.out.println("D");
        }
        
        if(decimal == 1000) {
            System.out.println("M");
        }
    }

}