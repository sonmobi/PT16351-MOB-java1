public class NhanVien {
    String hoTen;
    double luong;
    public NhanVien(String hoTen, double luong){
        this.hoTen = hoTen;
        this.luong = luong;
    }
    public void xuat(){
        System.out.println("Ho va ten: " + this.hoTen);
        System.out.println("Luong: " + String.format("%,.0f", this.luong) );
    }
}
