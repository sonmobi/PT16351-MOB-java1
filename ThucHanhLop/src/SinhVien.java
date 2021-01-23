import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private double diemTB;
    public SinhVien(){ }
    public SinhVien(String hoTen, double diemTB){
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public String XepLoai(){
        String ketQua = "";
        if(this.diemTB <0 || this.diemTB >10)
            ketQua = "Điểm không hợp lệ";
        else if(this.diemTB >=9 )
            ketQua = "Xuất sắc";
        else if(this.diemTB >= 8)
            ketQua = "Giỏi";
        else if(this.diemTB >=7)
            ketQua = "Khá";
        else if(this.diemTB >=5)
            ketQua = "Trung bình";
        else if (this.diemTB >=3.5)
            ketQua = "Yếu";
        else
            ketQua = "Kém";

        return ketQua;
    }
    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập họ tên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        this.diemTB = scanner.nextDouble();
    }
    public void Xuat(){
        System.out.println("----- THÔNG TIN SINH VIÊN -----");
        System.out.println("Họ và tên: " + this.hoTen);
        System.out.println("Điểm TB: " + this.diemTB);
        System.out.println("Xếp loại: " + this.XepLoai()   );
    }

}
