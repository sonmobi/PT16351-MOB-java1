import java.util.Scanner;

public class SinhVien {
    // khai báo thuộc tính
    public String maSV;
    public String hoTen;
    // khai báo các phương thức
    public SinhVien(){
        System.out.println("Gọi hàm khởi tạo SinhVien()");
    }
    public SinhVien(String hoTen){
        this.hoTen = hoTen;
        System.out.println("Gọi hàm khởi tạo SinhVien() có tham số hoTen");
    }
    public SinhVien(String maSV, String hoTen){
        System.out.println("Gọi hàm khởi tạo 2 tham số");
        this.maSV = maSV;
        this.hoTen = hoTen;
    }

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã SV: ");
        this.maSV = scanner.nextLine();

        System.out.print("Nhập họ tên: ");
        this.hoTen = scanner.nextLine();

    }
    public void InThongTin(){
        System.out.println("=====THÔNG TIN SINH VIÊN=====");
        System.out.println("Họ và tên: " + this.hoTen);
        System.out.println("Mã SV: " + this.maSV);
    }

}
