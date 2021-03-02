import GoiA.LopA;
import GoiB.LopB;
import GoiB.LopC;

public class Main {
    public static void main(String[] args) {
        // gọi công cộng
        LopA objLopA = new LopA();
        objLopA.InThongTin();

        // gọi LopB để thực thi truy cập protect ở trong hàm 1
        LopB objLopB = new LopB();
        objLopB.thuocTinhPublic = "Public B";
        objLopB.Ham01();
        // gọi lớp C để thực thi truy cập public trong hàm x
        LopC objLopC = new LopC();
        objLopC.HamX();
    }
}
