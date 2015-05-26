import com.sun.javadoc.*;

import java.util.ArrayList;
import java.util.List;

public class ListClass {


    /**
     * Very simple example for Doclet
     *
     * @param root
     * @return
     */
    public static boolean start(RootDoc root) {

        String path;
        ArrayList<MethodInfo> mdList = new ArrayList<MethodInfo>();

        ClassDoc[] classes = root.classes();
        for (int i = 0; i < classes.length; ++i) {
            ClassDoc c = classes[i];
            // Methods
            for(MemberDoc m : c.methods()){


                mdList.add(new MethodInfo(m));

            }
        }

        // path, function name, param, return, return example, desc
        System.out.println(genTable(mdList));
        return true;
    }



    private static String genTable(List<MethodInfo> methodDescs) {
        StringBuilder sb = new StringBuilder("<table>");
        for(MethodInfo desc : methodDescs){
            sb.append("<tr>");
            sb.append(desc.toString());
            sb.append("</tr>");

        }
        sb.append("</table>");

        return sb.toString();
    }


}

