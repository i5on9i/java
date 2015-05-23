import com.sun.javadoc.*;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

    private static String TARGET_ANNOTATION = "com.RequestMapping.value()";;

    /**
     * Very simple example for Doclet
     *
     * @param root
     * @return
     */
    public static boolean start(RootDoc root) {

        String path;
        ArrayList<MethodDesc> mdList = new ArrayList<MethodDesc>();

        ClassDoc[] classes = root.classes();
        for (int i = 0; i < classes.length; ++i) {
            ClassDoc c = classes[i];
            System.out.println(c);


            // Methods
            for(MemberDoc m : c.methods()){

                mdList.add(aMethod(m));

            }
        }

        // path, function name, param, return, return example, desc
        System.out.println(genTable(mdList));
        return true;
    }

    private static MethodDesc aMethod(MemberDoc m) {
        // tags
        for(Tag t : m.tags()){
            System.out.println("name = " + t.name());
            System.out.println("text = " + t.text());
        }

        return new MethodDesc(m);
    }



    private static String genTable(List<MethodDesc> methodDescs) {
        StringBuilder sb = new StringBuilder("<table>");
        for(MethodDesc desc : methodDescs){
            sb.append("<tr>");
            sb.append(desc.toString());
            sb.append("</tr>");

        }
        sb.append("</table>");

        return sb.toString();
    }

    static class MethodDesc{

        private final String path;
        private final String func;
        private final Tag[] param;
        private String ret;
        private String retEx;
        private final String desc;

        public MethodDesc(MemberDoc m) {
            this.func = m.name();
            this.param = m.tags();


            for(Tag t : m.tags()){
                if(t instanceof ParamTag){
                    System.out.print("ddd");
                    ParamTag pt = (ParamTag) t;
                    String tag1 = pt.parameterName() + " : " + pt.parameterComment();

                }else{
                    // return, return example
                    if(t.name().equals("@t.returnFields")){
                        String tname = "Return Fields : ";
                        ret = tname + t.text();;

                    }else if(t.name().equals("@t.returnExample")){
                        String tname = "Return Example : ";
                        retEx = tname + t.text();;


                    }
                }
            }
            this.desc = m.commentText();
            this.path = getPath(m);

        }

        private String getPath(MemberDoc m) {
            AnnotationDesc[] ads = m.annotations();
            for(AnnotationDesc ad : ads){
                // Annotation values
                for(AnnotationDesc.ElementValuePair pair : ad.elementValues()){

                    if(pair.element().toString().equals(TARGET_ANNOTATION)){
                        return pair.value().toString();
                    }
                }



            }
            return null;
        }

        public String toString(){
            StringBuilder sb = new StringBuilder("<td>");
            sb.append(this.path);
            sb.append("</td>");

            sb.append("<td>");
            sb.append(this.func);
            sb.append("</td>");

            sb.append("<td>");
            sb.append(this.ret);
            sb.append("</td>");

            sb.append("<td>");
            sb.append(this.retEx);
            sb.append("</td>");

            sb.append("<td>");
            sb.append(this.desc);
            sb.append("</td>");


            return sb.toString();
        }
    }
}

