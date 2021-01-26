import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<SVPoly> dssv;
    public static void main(String[] args) {
        dssv = new ArrayList<SVPoly>();
        System.out.println("CHƯƠNG TRÌNH QLSV");
        System.out.println("1.Nhập danh sách sinh viên");
        System.out.println("2.Xuất danh sách sinh viên đã nhập");
        System.out.println("3.Xuất danh sách sinh viên theo khoảng điểm");
        System.out.println("4.Tìm sinh viên theo họ tên");
        System.out.println("5.Tìm và sửa sinh viên theo họ tên");
        System.out.println("6.Tìm và xóa theo họ tên");
        System.out.println("7.Kết thúc");
        System.out.print("Mời bạn chọn 1 chức năng: ");
        int chon ;
        Scanner scanner = new Scanner(System.in);
        chon = Integer.parseInt( scanner.nextLine() );
        switch (chon){
            case 1:
                System.out.print("Bạn đã chọn 1, nhập số lượng SV:  ");
                int soLuongSV = Integer.parseInt( scanner.nextLine() );
                for(int i = 0; i< soLuongSV; i++){
                    System.out.println("Nhập SV " + i);
                    SVPoly sv = new SVPoly();
                    sv.Nhap();
                    dssv.add(sv);
                }

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }

    }
}
