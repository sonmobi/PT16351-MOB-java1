public class Main {
    public static void main(String[] args) {
        System.out.println("Thong tin nhan vien");
        NhanVien nhanVien = new NhanVien("Nguyen Van A",1000);
        nhanVien.xuat();

        System.out.println("Thong tin Truong phong");
        TruongPhong truongPhong = new TruongPhong("Tran B",20000,500);
        truongPhong.xuat();
    }
}
