package exercicio5;

import java.util.Scanner;

public class Controle {

    public static String leString(String msg){
        Scanner console = new Scanner(System.in);
        System.out.print(msg);
        return console.nextLine();
    }

    public static Integer leInteiro(String msg){
        Scanner console = new Scanner(System.in);
        System.out.print(msg);
        return Integer.parseInt(console.nextLine());
    }
}
