import java.util.ArrayList;
import java.util.List;

public class UnderstandGenerics {
    public static void main(String[] args) {
        List<ClassA> classA= new ArrayList();
        List<ClassB> classB= new ArrayList();
        //classA=classB;
       // classB=classA;
        //List<ClassA> class1B = classB;
    }
}
