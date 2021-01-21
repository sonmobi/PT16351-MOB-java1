public class Main {
    public static void main(String[] args){
        //-------------------------
//        SinhVien sinhVien1 = new SinhVien();
//        sinhVien1.Nhap();
//        System.out.println("Ho ten: " + sinhVien1.hoTen);
//        System.out.println("Mã SV: " + sinhVien1.maSV);
//        sinhVien1.InThongTin();
        //----------------------------

//        MayTinh mayTinh = new MayTinh();
//        int tong1 = mayTinh.Tong(3,8);
//        int tong2 = mayTinh.Tong(3,8,9);
//
//        System.out.println("Tổng 1 = " + tong1 + "\nTổng 2 = " + tong2);
//
        //--------------------------------
        // hàm khởi tạo sinh viên
        SinhVien sv1 = new SinhVien();
        sv1.InThongTin();

        SinhVien sv2 = new SinhVien("Nguyễn Văn A");
        sv2.InThongTin();

        SinhVien sv3 = new SinhVien("SV01", "Trần Văn C");
        sv3.InThongTin();

    }
}
