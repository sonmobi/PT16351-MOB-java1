import java.util.Scanner;

public class Mang {
    public void  vidu(){
        // Khai bao mang
        String [] dsHoTen = new String[3];
        dsHoTen[0] ="Nguyen Van A";
        dsHoTen[1] = "Nguyen Thi B";
        dsHoTen[2] = "Le Van C";

        for(int i = 0; i<dsHoTen.length; i++){
            System.out.println("Phan tu thu " + i +": " + dsHoTen[i]);
        }

        // cach 2
        for(String hoTen : dsHoTen){
            System.out.println(hoTen);
        }

        //----- mang so nguyen
        int[] m ={4,6,8,2};
        String[] gioTinh = new String[3];





    }

    public void SoChiaHetCho4(){
        int soLuong = 5;
        int[] mang = new int[soLuong] ;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<soLuong; i++){
            System.out.print("Nhap so nguyen: ");
            mang[i] = scanner.nextInt();
        }
        // in mảng
        for(int x : mang){
            if(x % 4 ==0){
//                System.out.println(String.valueOf(x));
//                System.out.println("" + x);
                System.out.println(x);
            }
        }
    }
}
