import java.util.Scanner;

public class Regex01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String chuoi;
        System.out.print("Hãy nhập vào một chuỗi: ");
        chuoi = scanner.nextLine();

        // định dạng điện thoại 10 số: 0912888999, 0968999111
        // nếu nhập thiếu số, có ký tự khác số
//        String bt1 = "[0-9.]{10}";
//        String bt2 = "0[0-9]{9}";// cải tiến giới hạn bắt buộc phải có số 0 ở đầu
//        // các đầu số: 097,098,096,091,090..
//        String bt3 = "09[0-9]{8}"; // cải tiến đúng đầu số
//        String bt4 = "09[78610][0-9]{7}";  // chạy thử với 0999999999
//
//        // ky tu dai dien
//        String bt5 = ".{10}";
//        // địa chỉ IP: 192.168.172.133
//        String bt6 = "[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}";
//
//        // kiểm tra chuỗi bắt buộc có chữ cái:
////        String bt7 = "([a-zA-Z]+[0-9]+){3}";


//        String bieuthuc_dt = "09[0-9]{8}";
//        // Viết biểu thức kiểm tra hợp lệ 1 chuỗi là mã sinh viên.
//        // PH12345 ==> 2 ký tự trong số các ký tự này phPH và 5 chữ số.
////        String bt_msv = "[phPH]{2}[0-9]{5}";
//        String bt_msv = "[phPH]{2}\\d{5}";

        // kiểm tra họ tên chỉ nhập chữ cái và tiếng việt có dấu
        String bt_hoten = "[ a-zA-ZàáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹđÀÁẠẢÃÂẦẤẬẨẪĂẰẮẶẲẴÈÉẸẺẼÊỀẾỆỂỄÌÍỊỈĨÒÓỌỎÕÔỒỐỘỔỖƠỜỚỢỞỠÙÚỤỦŨƯỪỨỰỬỮỲÝỴỶỸĐD]+";

        if( chuoi.matches( bt_hoten ) ){
            System.out.println("Bạn đã nhập đúng định dạng");
        }else{
            System.out.println("Bạn nhập sai định dạng");
        }


    }
}
