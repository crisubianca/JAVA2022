/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

/**
 *
 * @author Adm
 */

public class Laborator1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        String languages[] = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        
        int n = (int) (Math.random() * 1_000_000);
        System.out.println(n);
       
        int b = n * 3;
        System.out.println("Multiplication by 3: " + b);
        
        int x = 0b10101;
        System.out.println("Binary number is: " + x);
        
        int result = b + x;
        System.out.println("Sum with the binary number:" + result);
        
        int decimal = Integer.parseInt("FF", 16);
        System.out.println("Hex value: " + decimal);
        
        result = result + decimal;
        System.out.println("Sum with the hexadecimal number:" + result);
        
        result = result * 6;
        System.out.println("Multiplication by 6: " + result);
        
        System.out.println("Sum of the digits: " + sumDigits(result));
        
        if(sumDigits(result) < 10)
        {
           result = sumDigits(result);
           System.out.println("Willy-nilly, this semester I will learn " + languages[result]); 
        }
        else
        {
            result = sumDigits(result);
            System.out.println("Willy-nilly, this semester I will learn " + languages[result]);
        }
        
                
    }
    
     public static int sumDigits(long n) {
	int sum = 0;
		
	while(n > 0 || sum > 9) 
        {   
            if( n == 0){
                n = sum;
                sum = 0;
            }
	    sum += n % 10;
	    n /= 10;
	}
        
	return sum;
    }
    
}
