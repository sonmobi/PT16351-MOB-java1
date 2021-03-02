package GoiA;

public class LopA {
    public String thuocTinhPublic ="Public A";
    private String thuocTinhPrivate = "Private A";
    protected String thuocTinhProtected = "Protected A";

    public void InThongTin(){
        // đây là hàm trong nội bộ lớp A, toàn quyền sử dụng mọi thứ của lớp A.
        System.out.println("Thuoc rieng tu: " + this.thuocTinhPrivate);
    }

}
