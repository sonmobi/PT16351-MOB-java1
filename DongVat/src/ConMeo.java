public class ConMeo extends DongVat{
    public ConMeo(String name){
        this.name = name;
    }
    @Override
    public void speak() {
        System.out.println("Name: " + this.name);
        System.out.println("Speak: MEO MEO");
    }
}
