import org.junit.Test;

import java.io.File;
import java.net.URISyntaxException;

/**
 * User: Andremoniy
 * Date: 31.07.12
 * Time: 12:15
 */
public class TestSwitch {

    public static final int I_0 = 0;
    public static final int I_1 = 1;
    public static final int I_2 = 2;
    public static final int I_3 = 3;
    public static final int I_4 = 4;
    public static final int I_5 = 5;
    public static final int I_6 = 6;

    @Test
    public void getUrl() throws URISyntaxException {
        System.out.println(new File("test.xml").exists());
        System.out.println(TestSwitch.class.getResource("test.xml").toString());
        System.out.println(TestSwitch.class.getResource("test.xml").toURI().toString());
    }

    @Test
    public void testLoopAndSwitch() {

        boolean var2 = false;
        testLoop1(var2);
        System.out.println("xxx");
    }

    private void testLoop1(boolean var2) {
        loop:
        for (int i = 0; i < 10; i++) {
            IntWrapper ii = new IntWrapper(i);
            if (!var2) {
                switch (ii.getA()) {
                    case I_0:
                        System.out.println("0");
                        break;
                    case I_1:
                        System.out.println("1");
                        break;
                    case I_2:
                        break;
                    case I_5:
                        System.out.println("5");
                        break;
                    case I_3:
                        System.out.println("3");
                        break;
                    case I_4:
                        break;
                }
//            System.out.println("#i" + i);
            } else {
                switch (ii.getA()) {
                    case I_0:
                        System.out.println("0-2");
                        break loop;
                    case I_1:
                        System.out.println("1-2");
                        break loop;
                    case I_2:
                        break loop;
                }
            }
        }
    }

    public static class IntWrapper {
        int a;

        public IntWrapper(int a) {
            this.a = a;
        }

        int getA() {
            return a;
        }
    }
}
