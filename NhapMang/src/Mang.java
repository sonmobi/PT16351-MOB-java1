import java.util.Scanner;

public class Mang {
    public void NhapXuat(int n){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mảng: ");
        // gọi hàm nhập mảng.
        String[] dsDT = new String[n];
        for(int i = 0; i< n; i++)
        {
            dsDT[i] = scanner.nextLine();
        }
        //==== IN mảng
        System.out.println("IN mảng: ");
        for(String dt : dsDT){
            System.out.println(dt);
        }

    }



}
