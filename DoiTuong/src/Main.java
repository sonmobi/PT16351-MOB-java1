public class Main {
    public static void main(String[] args){
        SinhVien sinhVien1 = new SinhVien();
        sinhVien1.Nhap();
        System.out.println("Ho ten: " + sinhVien1.hoTen);
        System.out.println("Mã SV: " + sinhVien1.maSV);
        sinhVien1.InThongTin();
    }
}
