class A {
    private void run()
    {
        System.out.println("Hi This is Aayush");
    }
}
class B extends A {
    public void run()
    {
        System.out.println("Hi This is Ranjit");
    }
}

public class Main {
    public static void main(String[] args)
    {
        B child = new B();
        child.run();
    }
}
