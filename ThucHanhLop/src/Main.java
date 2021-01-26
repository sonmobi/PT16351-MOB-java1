import java.util.Arrays;

public class Main {
    public static void main(String[] args){
//        System.out.println("Sinh viên 1: ");
//        SinhVien sv1 = new SinhVien();
//        sv1.Nhap();
//        sv1.Xuat();
//
//        System.out.println("====== Sinh viên 2 ======");
//        SinhVien sv2 = new SinhVien("Nguyễn Văn A", 7.5);
//        sv2.Xuat();
        //----- tạo danh sách sinh viên -----------
        SinhVien [] sinhViens = new SinhVien[2];
        sinhViens[0] = new SinhVien("Nguyen Van A",2);
        sinhViens[1] = new SinhVien("Nguyen Van A",2);
        sinhViens[2] = new SinhVien("Nguyen Van A",2);
        System.out.println(Arrays.toString(sinhViens));

    }
}
