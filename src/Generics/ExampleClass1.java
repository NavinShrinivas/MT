package Generics;

public class ExampleClass1 implements SomeImplementation{
    int x;
    int y;
    public ExampleClass1(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int printA() {
        return x+y;
    }

    @Override
    public int printB() {
        return x-y;
    }

    @Override
    public int collateExample() {
        return x*y;
    }
}
