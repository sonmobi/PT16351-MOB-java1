import java.util.Scanner;

public class SVPoly {
    public String hoTen;
    public Double diemTB;
    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Họ tên SV: ");
        this.hoTen = scanner.nextLine();

        System.out.print("Nhập Điểm TB: ");
        this.diemTB = Double.parseDouble(scanner.nextLine());
    }
}
