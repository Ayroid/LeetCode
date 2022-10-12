package Strings;

import java.util.Scanner;

public class DefangingIP {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
    public static void main(String[] args) {
        DefangingIP d1 = new DefangingIP();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP Address: ");
        String ip = sc.nextLine();
        System.out.println(d1.defangIPaddr(ip));
    }
}
