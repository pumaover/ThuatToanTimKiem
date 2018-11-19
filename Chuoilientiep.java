package Cautrucdulieu;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Chuoilientiep {
    public static String congChuoi(int i,char[] list){
        String string1 = Character.toString(list[i]);
        if (i+1<list.length) {
            while ((int) list[i + 1] > (int) list[i]) {
                string1 += Character.toString(list[i + 1]);
                i++;
                if (i + 1 >= list.length) break;
            }
        }
        return string1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("string = ");
        String string = scanner.nextLine();
        char list[] = new char[string.length()];
        for (int i=0; i<string.length();i++) {
            list[i] = string.charAt(i);
        }
      Stack<String> stringStack = new Stack<>();
        String string1 = "";
        int i=0;
        while (i < list.length){
            string1 = congChuoi(i,list);
            stringStack.push(string1);
            i=i+string1.length();
        }
        string1 = stringStack.pop();
        String s;
     int size =stringStack.size();
        System.out.println(size);
        for (i=0;i<size;i++){
            s= stringStack.pop();
            if (s.length()>string1.length()){
                string1 = s;
            }
        }
        System.out.println("size="+stringStack.size());
        System.out.println(string1);
    }
}
