public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        Person bob = new Person("bob");
        System.out.println(bob.getName());
        System.out.printf("%s says hi", bob.getName());
    }
}