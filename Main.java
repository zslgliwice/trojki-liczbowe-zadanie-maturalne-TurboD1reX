import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws PersonalExceptions, FileNotFoundException{
        File file = new File("trojki.txt");

        try (Scanner scan = new Scanner(file)) {
            String[] data;
            String temp;
            while(scan.hasNextLine()){
                data = scan.nextLine().split(" ");
                int n1 = Integer.parseInt(data[0]);
                int n2 = Integer.parseInt(data[1]);
                int n3 = Integer.parseInt(data[2]);
                temp = data[0] + data[1];
                int[] tab = new int[temp.length()];
                int suma = 0;
                for(int i = 0; i < temp.length();i++){
                    tab[i] = temp.charAt(i) - '0';
                }
                for(int i = 0; i < tab.length;i++){
                    suma += tab[i];
                }
                if(suma == n3){
                    System.out.println(n1 + " " + n2 + " " + n3);
                }
            }
        }
          System.out.println("--------------------------");
        try (Scanner scan = new Scanner(file)) {
            String[] data;
            while(scan.hasNextLine()){
                data = scan.nextLine().split(" ");
                int n1 = Integer.parseInt(data[0]);
                int n2 = Integer.parseInt(data[1]);
                int n3 = Integer.parseInt(data[2]);
                if (Pierwsza(n1) && Pierwsza(n2)) {
                    if(n1 * n2 == n3){
                        System.out.println(n1 + " " + n2 + " " + n3);
                    }
                } 
            }   
        } 
        System.out.println("--------------------------");
        try (Scanner scan = new Scanner(file)) {
            String[] data;
            while(scan.hasNextLine()){
                data = scan.nextLine().split(" ");
                int n1 = Integer.parseInt(data[0]);
                int n2 = Integer.parseInt(data[1]);
                int n3 = Integer.parseInt(data[2]);
                if(Math.pow(n1,2) + Math.pow(n2,2) == Math.pow(n3,2)){
                    System.out.println(n1 + " " + n2 + " " + n3);
                }
            }   
        } 
}
    public static boolean Pierwsza(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}