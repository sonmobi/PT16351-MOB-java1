public class ConVit extends DongVat{
    // phương thức khởi tạo của lớp con
    public ConVit(String name){
        this.name = name;
    }
    // ghi đè phương thức trừu tượng của lớp cha (DongVat)
    @Override
    public void speak() {
        System.out.println("Name: "+ this.name);
        System.out.println("Speak: QUAC QUAC");
    }
}
