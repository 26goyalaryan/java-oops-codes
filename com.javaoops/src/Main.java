public class Main {
    public static void main(String[] args) {
        textbox t1= new textbox();
        // var t1 = new textbox();
        // this will initialise t1 on the basis of what is on the right side of =
        t1.text="box1";
        System.out.println(t1.text);
        t1.clear();
        System.out.println(t1.text);
    }
}