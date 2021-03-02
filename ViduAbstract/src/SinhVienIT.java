public class SinhVienIT extends SinhVien {
    double diemJava;
    double diemC;
    @Override
    public double getDiem() {
        return  (this.diemJava + this.diemC);
    }
}
