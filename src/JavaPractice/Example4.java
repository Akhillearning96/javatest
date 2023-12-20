package JavaPractice;

import java.util.Scanner;

public class Example4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line_num = 0;
        while(sc.hasNext()) {
        	String line = sc.nextLine();
        	
        	System.out.println(++line_num + " " + line);
        }
        sc.close();

    }

}
