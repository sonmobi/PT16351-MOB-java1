package Goi3;
import PhamViTruyCap.LopA;
public class LopD extends LopA {
    public void kiemTra(){
        LopA lopA = new LopA();
        lopA.a = 2;

        lopA.c = 2;
        lopA.d = 2; //lỗi
        this.b = 2;

    }
}
