import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ConMeo conMeo = new ConMeo("MiuMiu");
//        conMeo.speak();
//
//        ConVit conVit = new ConVit("VitVit");
//        conVit.speak();

        // Tạo danh sách con mèo để quản lý:
        Scanner scanner = new Scanner(System.in);
        ArrayList<ConMeo> dsMeo = new ArrayList<ConMeo>();
        int soLuong;
        System.out.print("Nhap so luong con meo n = ");
        soLuong = Integer.parseInt( scanner.nextLine() );
        // lặp n lần để tạo đối tượng conmeo đưa vào ds
        for(int i =0; i<soLuong; i++){
            // Nhập tên mèo:
            System.out.printf ("Nhap ten con meo thứ %d : ", (i+1)  );
            String name = scanner.nextLine();
            // khai báo đối tượng con mèo

            ConMeo conMeo = new ConMeo( name );
            dsMeo.add(conMeo);
        }
        // kết thúc vòng lặp là có 1 danh sách.
        //xuất thông tin
        System.out.println("Danh sách con meo");
        for(int i = 0; i< dsMeo.size(); i++ ){
            ConMeo conMeo = dsMeo.get(i);
            conMeo.speak();

        }





    }
}
