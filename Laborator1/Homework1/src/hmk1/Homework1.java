/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hmk1;

import java.util.Random;

/**
 *
 * @author Adm
 */
public class Homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Homework1 app = new Homework1();
        int firstArg = 0;
        int secondArg = 0;
        char alphabet[] = new char[args.length-2];
        if(args.length >= 3){
            if(args.length > 0){
                try{
                    firstArg = Integer.parseInt(args[0]);
                } catch (NumberFormatException e){
                    System.err.println("Argument " + args[0] + " must be an integer.");
                    System.exit(1);
                }  finally{
                    System.out.println(args[0]);
                }
            }
            
            if(args.length > 0){
                try{
                    secondArg = Integer.parseInt(args[1]);
                } catch (NumberFormatException e){
                    System.err.println("Argument " + args[1] + " must be an integer.");
                    System.exit(1);
                } finally{
                    System.out.println(args[1]);
                    
                }
            }
            
            for(int i = 0; i < alphabet.length; i++){
                alphabet[i] = args[i+2].charAt(0);
            }
            for(char j: alphabet)
                System.out.println(j);        
        }
        else
        {
            System.err.println("Not enough arguments entered");          
        }
        
        String words[] = new String[firstArg];
        for(int s = 0; s < firstArg; s++){
            String word = app.createRandomWord(secondArg, alphabet);
            words[s] = word;
        }
        for(String ar: words)
            System.out.println(ar);

        
    }
    
    private String createRandomWord(int len, char[] alphabet){
        StringBuilder word = new StringBuilder();
        Random rand = new Random();
        for(int l = 0; l < len; l++){
            int k = rand.nextInt(alphabet.length);
            word.append(alphabet[k]);
        }
        return word.toString();
    }
    
}
