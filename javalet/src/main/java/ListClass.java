import com.sun.javadoc.*;

public class ListClass {
    public static boolean start(RootDoc root) {
        ClassDoc[] classes = root.classes();
        for (int i = 0; i < classes.length; ++i) {
            System.out.println(classes[i]);
        }
        return true;
    }

    public static void main(String[] args) {


//        com.sun.tools.javadoc.Main.execute(new String[]{"-doclet " + ListClass.class.getName()});
        String[] options = new String[]{
                "-doclet",
                ListClass.class.getName(),
                "-docletpath",
                "..\\..\\..\\build\\classes\\main",
                "Test.java"
        };
        com.sun.tools.javadoc.Main.execute(options);
    }
}

