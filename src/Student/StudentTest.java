package Student;
import static org.junit.Assert.assertEquals;
public class StudentTest {
    Student t;
    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("before");
        this.t = new Student("Stu1",3,"NeoVim","UNI1", "gender1");
    }
    @org.junit.Test
    public void TestSomeLogic(){
       int expted = 5;
       int actual = t.SomeLogic(5,10);
       assertEquals(expted, actual);

    }
}
