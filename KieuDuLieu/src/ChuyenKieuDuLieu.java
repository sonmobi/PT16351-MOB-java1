public class ChuyenKieuDuLieu {
    public  static void main(String [] args){
//        String a = "3";
//        String b = "5";
//        String c = a + b;
//        System.out.println(c);
//
//        int  x = Integer.parseInt(a);
//        int y = Integer.parseInt(b);
//        int tong = x + y;
//        System.out.println(tong);
//
//       double kytu = 5;
//
//       int t = 2 + (int) kytu;
//       System.out.println(t);

        //============try catch =================
        System.out.println("Bat dau chuong trinh");
        String x = "2";
//        int y = Integer.parseInt(x); // dòng này để ngoài khối try catch, nếu trường hợp xảy ra lỗi thì chương trình sẽ die.

        try{
            int y = Integer.parseInt(x);
            System.out.println("So nguyen chuyen duoc " + y);
        }catch (Exception exception){
            exception.printStackTrace(); // hiển thị toàn bộ logic lỗi
            System.out.println("Loi chuyen kieu du lieu: " + exception.getMessage()); // chỉ hiển thị câu thông báo
        }



        System.out.println("ket thuc chuong trinh");
    }

}
