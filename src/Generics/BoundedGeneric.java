package Generics;

public class BoundedGeneric<T extends SomeImplementation>{
    SomeImplementation x;
    public BoundedGeneric(T x){
        this.x = x;
    }

    public int something_nice(T y){
        return this.x.collateExample()+y.collateExample();
    }
}
