import java.util.Scanner;

public class SinhVien {
    // khai báo thuộc tính
    public String maSinhVien;
    public String hoTen;
    public Double diemTongKet;
    // Khai báo phương thức:
    public void Nhap(){
        // dùng scaner để nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã SV: ");
        this.maSinhVien = scanner.nextLine();
        System.out.print("Nhập Họ tên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhập Điểm: ");
        this.diemTongKet =Double.parseDouble( scanner.nextLine() );
    }
    public void Xuat(){
        System.out.println("THÔNG TIN");
        System.out.println("Mã SV: " + this.maSinhVien);
        System.out.println("Họ tên: "  + this.hoTen);
        System.out.println( "Điểm TB: "  + this.diemTongKet );
    }

}
