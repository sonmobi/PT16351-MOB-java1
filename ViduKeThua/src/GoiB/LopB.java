package GoiB;

import GoiA.LopA;

public class LopB extends LopA {
    // đây là lớp con của A nên dùng được 2 thuộc tính
        public void Ham01(){
            System.out.println("Thuoc tinh Public trong lop B: " + this.thuocTinhPublic);
            this.thuocTinhPublic = "Public B2";
            this.thuocTinhProtected = "protected B2";

            System.out.println("KQ Gán giá trị nội bộ lớp B: " + this.thuocTinhPublic);
            System.out.println("KQ Gán giá trị nội bộ lớp B:: " + this.thuocTinhPublic);
        }

}
