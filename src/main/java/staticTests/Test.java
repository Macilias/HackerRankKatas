package staticTests;

import java.util.LinkedList;
import java.util.List;

/**
 * Example from https://stackoverflow.com/questions/2420389/static-initialization-blocks
 */
public class Test {

    static{
        System.out.println("Static");
    }

    {
        System.out.println("Non-static block");
    }

//    class Test2 {
//
//        {
//            System.out.println("Non-static block Test 2");
//        }
//
//    }

    public static void main(String[] args) {
        Test t = new Test();
        List l = new LinkedList();
//        Test2 t2 = new Test2();
    }
}
