/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class GAME2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int attempt = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(9-0+1)+0;
        System.out.print("Программа запомнила число от 0 до 9, угадай! ");
    //    for(int i = 0; i < 3; i++){
        while(true){
            int userNumber = scanner.nextInt();
            if(number == userNumber){
                System.out.println("Ура! Ты выиграл!!!");
                break;
            }else{
                if(attempt < 2){
                    System.out.println(":(, неправильно. Попробуй еще раз: ");
                }else{
                    System.out.println(":(, ты проиграл");
                    break;
                }
            } 
            attempt++;
        }
    
    }
    
}
