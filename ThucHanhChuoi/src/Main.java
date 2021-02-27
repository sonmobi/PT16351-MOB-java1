import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String chuoi;
        Scanner scanner = new Scanner(System.in);
        //1. Nhập:
        System.out.println("Nhập vào 1 chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();

        //2. Thao tác với chuỗi
        String chu_thuong =   chuoi.toLowerCase();
        System.out.println("Chữ thường: " + chu_thuong);

        String[] mang =   chuoi.split(" ");
        System.out.println("Mảng: " + Arrays.toString(mang)  );
        // lấy 5 ký tự đầu
//        String choi_con = chuoi.substring()

    }

}
