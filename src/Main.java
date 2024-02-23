import Student.Student;
import Threads.Runs;
import Threads.Thread1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Multi Threaded Examples :");
//        Runnable r = new Runs(4);
//        Thread t4 = new Thread(r);
    //        t1.start();
    //        t1.setDaemon(true);
    //        try {
    //            t1.join();
    //        } catch (InterruptedException e) {
    //            throw new RuntimeException(e);
    //        }
//        ExecutorService exsev = Executors.newFixedThreadPool(2);
//        Thread1 t1 = new Thread1(1);
//        exsev.execute(t1);
//        Thread1 t2 = new Thread1(2);
//        exsev.execute(t2);
//        Thread1 t3 = new Thread1(3);
//        exsev.execute(t3); // Never executed as t1 and t2 are busy infinite jobs that block the thread
//        exsev.execute(t4);
//

        // Collections :
        ArrayList students = new ArrayList();
        students.add(new Student("Stu1",3,"NeoVim","UNI1", "gender1"));
        students.add(new Student("Stu2",6,"NeoVim","UNI1", "gender1"));
        students.add(new Student("Stu3",2,"VsCode","UNI1", "gender3"));
        students.add(new Student("Stu4",10,"Vim","UNI1", "gender2"));
        students.add(new Student("Stu5",8,"Emacs","UNI1", "gender0"));
        students.sort(new StudentComparator());
        for (Object student : students) {
            System.out.println(student);
        }
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.compareTo(o2);
    }
}