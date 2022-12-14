import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("T.C. kimlik numaranızın son iki hanesini hesaplamaya hoş geldiniz");
        System.out.println("T.C. kimlik numaranızın 1. hanesini giriniz");
        Scanner input1 = new Scanner(System.in);
        int tc1 = input1.nextInt();
        while (tc1 == 0){
            System.out.println("T.C. Kimlik numaranızın ilk hanesi 0 olamaz Lütfen tekrardan giriniz");
            System.out.println("T.C. kimlik numaranızın 1. hanesini giriniz");
            Scanner input1v1 = new Scanner(System.in);
            int tc1v1 = input1v1.nextInt();
            int a = tc1;
            tc1 = tc1v1;
        }
        System.out.println("T.C. kimlik numaranızın 2. hanesini giriniz");
        Scanner input2 = new Scanner(System.in);
        int tc2 = input1.nextInt();
        System.out.println("T.C. kimlik numaranızın 3. hanesini giriniz");
        Scanner input3 = new Scanner(System.in);
        int tc3 = input1.nextInt();
        System.out.println("T.C. kimlik numaranızın 4. hanesini giriniz");
        Scanner input4 = new Scanner(System.in);
        int tc4 = input1.nextInt();
        System.out.println("T.C. kimlik numaranızın 5. hanesini giriniz");
        Scanner input5 = new Scanner(System.in);
        int tc5 = input1.nextInt();
        System.out.println("T.C. kimlik numaranızın 6. hanesini giriniz");
        Scanner input6 = new Scanner(System.in);
        int tc6 = input1.nextInt();
        System.out.println("T.C. kimlik numaranızın 7. hanesini giriniz");
        Scanner input7 = new Scanner(System.in);
        int tc7 = input1.nextInt();
        System.out.println("T.C. kimlik numaranızın 8. hanesini giriniz");
        Scanner input8 = new Scanner(System.in);
        int tc8 = input1.nextInt();
        System.out.println("T.C. kimlik numaranızın 9. hanesini giriniz");
        Scanner input9 = new Scanner(System.in);
        int tc9 = input1.nextInt();
        int tc10 = 7*(tc9 + tc7 + tc5 + tc3 + tc1) - (tc2 + tc4 + tc6 + tc8);
        System.out.println("T.C. Kimlik numaranızın 10. hanesi:" + tc10%10);
        int tc11 = tc9 + tc7 + tc5 + tc3 + tc1 + tc2 + tc4 + tc6 + tc8 + tc10;
        System.out.println("T.C. Kimlik numaranızın 11. hanesi:" + tc11%10);
    }
}