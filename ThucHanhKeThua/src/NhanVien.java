import java.util.Scanner;

public class NhanVien {
    String maNV;
    String hoTen;
    double luong;
    public  void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã NV: ");
        this.maNV = scanner.nextLine();
        System.out.print("Nhập Họ tên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhập lương: ");
        this.luong = Double.parseDouble( scanner.nextLine() );
    }
    public  void xuatThongTin(){
        System.out.println("Thông tin nhân viên");
        System.out.println("Mã: " + this.maNV);
        System.out.println("Họ tên: " + this.hoTen);
        System.out.println("Lương: " + this.luong);
    }
    public double getThuNhap(){
        double thuNhap = 0;
        return thuNhap;
    }
    public double getThueTN(){
        double thue = 0;

        return thue;
    }

}
