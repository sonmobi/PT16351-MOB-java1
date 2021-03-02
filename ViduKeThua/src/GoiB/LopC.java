package GoiB;

import GoiA.LopA;

public class LopC {
    // đây là lớp người ngoài nên chỉ đùng được public
    public void HamX(){
        LopA objLopA = new LopA();
        objLopA.thuocTinhPublic = "Goi công khai";
    }
}
