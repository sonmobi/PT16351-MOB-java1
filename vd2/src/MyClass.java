import java.util.Scanner;
public class MyClass {
    public static void main(String [] args){
        System.out.println("Nhap vao ho ten: ");
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();

        System.out.println("Ho va ten: " + hoTen);

        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.Nhap();

        System.out.println("Dien tich HCN = " + hinhChuNhat.DienTich());

    }
}
