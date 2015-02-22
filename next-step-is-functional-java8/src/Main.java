public class Main {

    // Is Runnable object a predicate?
    public static String doSomething(IFooer r) throws Exception {
        return r.foo();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(doSomething(() -> "42"));
    }

}
