public class TruongPhong  extends  NhanVien{
    double trachNhiem;
    public TruongPhong(String hoTen, double luong, double trachNhiem) {
        super(hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    public void  xuat(){
        super.xuat();
        System.out.println("Trach nhiem: " + this.trachNhiem);
    }
}
