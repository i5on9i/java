/**
 * Created by namh on 2015-05-23.
 */
public class DocletTest {

    public static void main(String[] args) {


//        com.sun.tools.javadoc.Main.execute(new String[]{"-doclet " + ListClass.class.getName()});
        String[] options = new String[]{
                "-doclet",
                ListClass.class.getName(),
                "-docletpath",
                "..\\..\\..\\build\\classes\\main",
                "-sourcepath",
                "d:\\mine\\programming\\java\\javalet\\src\\main\\java",
                "com"
        };
        com.sun.tools.javadoc.Main.execute(options);
    }
}
