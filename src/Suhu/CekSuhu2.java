package Suhu;

import java.util.Scanner;

public class CekSuhu2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Suhu saat ini: ");
        int Suhu = scanner.nextInt();
        String JenisSuhu;

        if (Suhu == 0) {
            JenisSuhu = "Beku";
        } else if (Suhu > 0 && Suhu < 30) {
            JenisSuhu = "Dingin";
        } else if (Suhu >= 30 && Suhu < 40) {
            JenisSuhu = "Hangat";
        } else if (Suhu >= 40 && Suhu < 70) {
            JenisSuhu = "Panas";
        } else if (Suhu >= 70 && Suhu< 100) {
            JenisSuhu = "Hampir Mendidih";
        } else if (Suhu >= 100 && Suhu < 120) {
            JenisSuhu = "Mendidih";
        } else if (Suhu >= 120){
            JenisSuhu = "Gosong";
        } else {
            JenisSuhu = null;
        }
        System.out.println("===========");
        System.out.println("Suhunya " + JenisSuhu);{
        }
    }
}




