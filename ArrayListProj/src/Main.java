import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
        ArrayList<String> dsTen = new ArrayList<String>();
        dsTen.add("Nguyễn Văn A");
        dsTen.add("Trần Văn B");
        dsTen.add("Hà Nội");

        System.out.println("Phần tử thứ 1: " + dsTen.get(0) );
        System.out.println("Phần tử thứ 3: " + dsTen.get(2) );

        System.out.println("Số lượng phần tử: " + dsTen.size() );

        for(int i =0; i< dsTen.size(); i++){
            System.out.println("Phần tử: " + i + "=>" + dsTen.get(i) );
        }

        for(String ten : dsTen){
            System.out.println(ten);
        }
        //---------- Nhập liệu =================================
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> dsMoi = new ArrayList<String>();

        for(int i = 0; i<5; i++){
            System.out.print("Nhập phần tử thứ " + i);
            dsMoi.add(   scanner.nextLine()  );
        }
        // in danh sách mới:
        System.out.println("Các phần tử đã nhập trong ds mới");
        for(String x : dsMoi){
            System.out.println(x);
        }

    }
}
