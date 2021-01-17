import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

//        System.out.println("1 - Bang cuu chuong");
//        System.out.println("2 - Trung binh cong");
//        System.out.print("Chon chuc nang: ");
//        int chon;
//        int so =0;
//        Scanner sc = new Scanner(System.in);
//        chon = sc.nextInt();
//        switch (chon){
//            case 1:
//                // công việc 1
//                do{
//                    System.out.print("Nhap 1 so: ");
//                    so = sc.nextInt();
//                }while (so <2 || so >10);
//                // gọi hàm tính toán
//                TinhToan tinhToan = new TinhToan();
//                tinhToan.BangCuuChuong(so);
//
//
//                break;
//
//            case 2:
//                // công việc 2
//                break;
//
//
//        }

        //==================================
//        // Viết chương trình in ra các số từ 1 -10 bỏ qua số chia hết cho 3
//        for(int i = 1; i<= 10;i++){
//
//            if(i % 3 == 0)
//                continue;
//            System.out.println("So thu " + i);
//
//            if(i >5 )
//                break;
//        }

        Mang mang = new Mang();
//            mang.vidu();
        mang.SoChiaHetCho4();



    }

}
