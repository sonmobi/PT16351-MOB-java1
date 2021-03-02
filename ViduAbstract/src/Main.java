public class Main {
    public static void main(String[] args) {
        SinhVienIT sinhVienIT = new SinhVienIT();
        sinhVienIT.diemC = 7;
        sinhVienIT.diemJava = 8;
        double tong = sinhVienIT.getDiem();
        System.out.println("Tong diem: " + tong);
    }
}
