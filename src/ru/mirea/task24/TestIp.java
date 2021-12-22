package ru.mirea.task24;
import java.util.Scanner;
import java.util.regex.Pattern;
public class TestIp {

        private static boolean checkIP(String ip) {return ip.matches("(\\d|\\d\\d|[01]\\d\\d|2[01234]\\d|25[0-5]).(\\d|\\d\\d|[01]\\d\\d|2[01234]\\d|25[0-5]).(\\d|\\d\\d|[01]\\d\\d|2[01234]\\d|25[0-5]).(\\d|\\d\\d|[01]\\d\\d|2[01234]\\d|25[0-5])");}
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String inputIP = sc.nextLine();
            if (checkIP(inputIP) == true)
                System.out.println("Строка является IP-адресом");
            else System.out.println("Строка не является IP-адресом");
        }

}
