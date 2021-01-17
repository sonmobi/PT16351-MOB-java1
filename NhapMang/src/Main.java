import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n =-1;
        Scanner scanner = new Scanner(System.in);

        do{

            try{
                System.out.print("Nhập một số n= ");
                n = scanner.nextInt();

                if(n>0){
//                    scanner.skip("\\R"); // xóa bỏ phần ký tự enter ở lần nhập số
//                    // gọi hàm nhập mảng.
//                    String[] dsDT = new String[n];
//                    for(int i = 0; i< n; i++)
//                    {
//                        dsDT[i] = scanner.nextLine();
//                    }
//                    //==== IN mảng
//                    System.out.println("IN mảng: ");
//                    for(String dt : dsDT){
//                        System.out.println(dt);
//                    }
                    // cách 2: Gọi đối tượng riêng
                    Mang m = new Mang();
                    m.NhapXuat(n);

                }else if(n == 0){
                    System.out.println("Tạm biệt!");
                }else{
                    System.out.println("Hãy nhập số Dương");
                }

            }catch (Exception e){
                //  e.printStackTrace();
                System.out.println("Ban nhap sai: " + e.getMessage());
            }
            scanner.nextLine();
        }while (n < 0 );








    }
}
