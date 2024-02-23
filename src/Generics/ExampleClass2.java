package Generics;

public class ExampleClass2 implements SomeImplementation{
    int x;
    int y;
    public ExampleClass2(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int printA() {
        return x+100;
    }

    @Override
    public int printB() {
        return x-100;
    }

    @Override
    public int collateExample() {
        return x/y;
    }
}
