import java.util.Scanner;

public class HinhChuNhat {
    private int a;
    private int b;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh a = ");
        this.a = sc.nextInt();
        System.out.println("Nhap canh b = ");
        this.b = sc.nextInt();
    }
    public int DienTich (){
        return  this.a * this.b;

    }
}
