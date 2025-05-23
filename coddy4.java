import java.util.Scanner;

public class coddy4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NUM: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            if (i % 2 != 0) {
                String str = new String(new char[i]).replace("\0", "*");
                System.out.println(str);
            }
        }
        sc.close();

    }
}
