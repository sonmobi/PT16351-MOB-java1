public class Main {
    public static void main(String[] args){
        System.out.println("Sinh viên 1: ");
        SinhVien sv1 = new SinhVien();
        sv1.Nhap();
        sv1.Xuat();
        System.out.println("Sinh viên 2");
        SinhVien sv2 = new SinhVien("Nguyễn Văn A", 7.5);
        sv2.Xuat();
    }
}
