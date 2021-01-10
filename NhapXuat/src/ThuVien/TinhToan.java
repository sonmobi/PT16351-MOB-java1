package ThuVien;

import java.util.Scanner;

public class TinhToan {
    public void TinhTong(){
        double a, b, tong;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nCHUONG TRINH TINH TONG");
        System.out.print("Nhap vao so a = ");
        a = sc.nextDouble();
        System.out.print("Nhap so b = ");
        b = sc.nextDouble();
        tong = a + b;
        System.out.printf("Tong %f + %f = %f ", a, b, tong );
    }
}
