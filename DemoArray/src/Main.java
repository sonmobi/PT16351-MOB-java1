import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Khai báo 1 mảng số nguyên gồm n phần tử nhập từ bàn phím.
        // in mảng ra màn hình, sau đó sắp xếp mảng tăng dần và in mảng
        /* Integer [] mang;
        int soLuong;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử mảng: ");
        soLuong = Integer.parseInt(   scanner.nextLine()  );
        // khởi tạo mảng
        mang = new Integer[soLuong];
        //--- nhập mảng
        System.out.println("Bắt đầu nhập mảng");
        for(int i = 0; i<soLuong; i++){
            System.out.printf("Nhập phần tử thứ %d: ",i);
            mang[i] = Integer.parseInt(  scanner.nextLine() );
        }

         */
        //====================================================================
//        //---- in mảng ra màn hình
//        System.out.println("Mảng vừa nhập");
//        for(int x : mang)
//            System.out.println(x);
//        // cách in 2:
//        System.out.println(  Arrays.toString(mang) );
//        // sắp xếp mảng
//        Arrays.sort(mang);
//        System.out.println(  Arrays.toString(mang) ); // in mảng sau khi sắp xếp
//
        /*
        // chuyển mảng thành List: Yêu cầu mảng chuyển thành kiểu lớp Integer
        List<Integer> ds_so_nguyen =   Arrays.asList(mang);
        System.out.println("So luong trong list: " + ds_so_nguyen.size() );
        Integer a = 5;

        //=----- In danh sách
        for(int i = 0; i<ds_so_nguyen.size(); i++){
            Integer tmp = ds_so_nguyen.get(i);
            System.out.println("Giá trị thứ "+ i + " = " + tmp.toString());
        }

         */
        //====================================================================
        //======= Sử dụng ArrayList để lưu danh sách ==========================
        ArrayList<String> dssp = new ArrayList<String>();
        dssp.add("Điện thoại");
        dssp.add("Máy tính");
        dssp.add("Tivi");
        // in ds
        for (int i = 0; i< dssp.size();i++){
            System.out.println(      dssp.get(i)     );
        }
        System.out.println("Số lượng trước khi xóa: " +    dssp.size() );
        dssp.clear(); // xóa hết phần tử
        System.out.println("Số lượng còn lại sau khi xóa: " +    dssp.size() );

    }
}
