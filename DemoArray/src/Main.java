import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Khai báo 1 mảng số nguyên gồm n phần tử nhập từ bàn phím.
        // in mảng ra màn hình, sau đó sắp xếp mảng tăng dần và in mảng
        int [] mang;
        int soLuong;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử mảng: ");
        soLuong = Integer.parseInt(   scanner.nextLine()  );
        // khởi tạo mảng
        mang = new int[soLuong];
        //--- nhập mảng
        for(int i = 0; i<soLuong; i++){
            mang[i] = Integer.parseInt(  scanner.nextLine() );
        }
        //---- in mảng ra màn hình
        System.out.println("Mảng vừa nhập");
        for(int x : mang)
            System.out.println(x);
        // cách in 2:
        System.out.println(  Arrays.toString(mang) );



    }
}
