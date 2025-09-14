public class Printer {
    public void Printer(String message, int number){
        System.out.println("message: " + message);
        System.out.println("number: " + number);
    }
    public static class Colorprinter extends Printer{
        public void print(String message){
            System.out.println("in color: " + message);
        }
    }
    public static void main(String[] args){
        Printer p = new Printer();
        p.Printer("Hello",5);
        Colorprinter cp = new Colorprinter();
        cp.print("Hello in color");
    }
}