package Student;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    String name;
    int age;
    String IDE;
    String College;
    String gender;

    public Student(String name, int age, String IDE, String College, String gender){
        this.name = name;
        this.age = age;
        this.IDE = IDE;
        this.College = College;
        this.gender = gender;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age; // Positive if this.age > 0.age
    }

    @Override
    public String toString(){
        return "Student: "+this.name+"| age: "+this.age+"| IDE: "+this.IDE;
    }

    public int SomeLogic(int x, int y){
        return (x*y)/MoreLogic();
    }
    int MoreLogic(){
        return 10;
    }
}

