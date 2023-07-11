package FuncInterfaceDemo;

public class Client {
    public static void main(String[] args) {
        FuncInterface funcInterface = new FuncClass();
        funcInterface.doSomething();

        FuncInterface funcInterface1 =
                new FuncInterface() {
            @Override
            public void doSomething() {
                System.out.println("Hi");

            }
        };
        FuncInterface funcInterface2 =
                new FuncInterface() {
                    @Override
                    public void doSomething() {
                        System.out.println("Hi");

                    }
                };
        funcInterface1.doSomething();
    }
}
