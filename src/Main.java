

public class Main {
    public static void main(String[] args) {
        PassGen passgen = new PassGen();
        System.out.println(passgen.getPassword(10));
        System.out.println(passgen.getPassword(3));
        System.out.println(passgen.getPassword(1));

    }
}