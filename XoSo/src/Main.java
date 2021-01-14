import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn chọn số: ");
        x = scanner.nextInt();
        //---- tạo số ngẫu nhiên

        Random random = new Random();
        int kq = random.nextInt(99);

        System.out.println("Bạn đã chọn: " + x + "\nKết quả: " + kq);
        if(x == kq)
            System.out.println("Chúc mừng bạn");
        else
            System.out.println("Chúc bạn may mắn lần sau");
    }
}
