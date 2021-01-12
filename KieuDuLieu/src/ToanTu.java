import java.util.Scanner;

public class ToanTu {
    public void SoDuong(){
        // Nhap 1 so nguyen kiem tra la duong hay am
        System.out.println("Chuong trinh kiem tra so duong");
        int x;
        String ketqua ;
        System.out.print("Nhap vao 1 so nguyen x = ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt(); // đọc số nguyên vào biến
        ketqua = x >0 ?"X là số dương": "X là không dương";
        System.out.println("Kết quả: " + ketqua);

        

    }       // nhiệm vụ: Sau khi chạy, cải tiến thêm truy catch để tránh lỗi die chương trình.
}
