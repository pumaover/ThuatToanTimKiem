package Cautrucdulieu;

import java.util.LinkedList;
import java.util.Scanner;

public class Chuoiphusapxep {
    public static LinkedList<Character> congChuoi(int i,String string){
            LinkedList<Character> string1 = new LinkedList<>();
            string1.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > string1.getLast())
                    string1.add(string.charAt(j));
                }
                return string1;
            }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("string = ");
        String string = scanner.nextLine();
      LinkedList<Character> chuoiphumax = congChuoi(0,string);
        for (int i=1;i<string.length();i++){
            if (congChuoi(i,string).size()>chuoiphumax.size()){
                chuoiphumax= congChuoi(i,string);
            }
        }
        System.out.println(chuoiphumax);
}
}
