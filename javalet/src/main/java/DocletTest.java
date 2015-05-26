/**
 * Created by namh on 2015-05-23.
 */
public class DocletTest {

    public static void main(String[] args) {


        final String SOURCE_PATH = "d:\\mine\\programming\\java\\javalet\\src\\main\\resources";
        final String FILE_OR_PACKAGE = "d:\\mine\\programming\\java\\javalet\\src\\main\\resources\\com\\Test.java";

//        com.sun.tools.javadoc.Main.execute(new String[]{"-doclet " + ListClass.class.getName()});
        String[] options = new String[]{
                "-doclet",
                ListClass.class.getName(),
                "-docletpath",
                "..\\..\\..\\build\\classes\\main",
                "-sourcepath",
                SOURCE_PATH,
                FILE_OR_PACKAGE
        };
        com.sun.tools.javadoc.Main.execute(options);
    }
}
