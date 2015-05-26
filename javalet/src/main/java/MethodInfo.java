


import com.sun.javadoc.*;
import com.sun.tools.javadoc.MethodDocImpl;

public class MethodInfo {

    private static String TARGET_ANNOTATION = "com.RequestMapping.value()";;

    private final String path;
    private final String func;
    private final String param;
    private String ret;
    private String retEx;
    private String mainMenu;
    private String subMenu;
    private final String desc;

    public MethodInfo(MemberDoc m) {
        this.func = m.name();
        this.param = getParam(m);



        for(Tag t : m.tags()){
            if(t instanceof ParamTag){
                ParamTag pt = (ParamTag) t;
                String tag1 = pt.parameterName() + " : " + pt.parameterComment();

            }else{
                // return, return example
                if(t.name().equals("@t.returnFields")){
                    String tname = "";
                    ret = tname + t.text();;

                }else if(t.name().equals("@t.returnExample")){
                    String tname = "";
                    retEx = tname + t.text();;


                }else if(t.name().equals("@t.mainmenu")){
                    String tname = "";
                    mainMenu = tname + t.text();;

                }else if(t.name().equals("@t.submenu")){
                    String tname = "";
                    subMenu = tname + t.text();;

                }
            }
        }
        this.desc = m.commentText();
        this.path = getPath(m);

    }

    private String getParam(MemberDoc m) {

        StringBuilder sb = new StringBuilder();
        String name = null, required = null;

        ParamTag[] ptags = ((MethodDocImpl) m).paramTags();
        Parameter[] params = ((MethodDocImpl) m).parameters();
        int max = Math.min(ptags.length, params.length);

        for(int i = 0 ; i < max ; i++){
            Parameter p = params[i];
            ParamTag pt = ptags[i];

            AnnotationDesc[] anos = p.annotations();
            for(AnnotationDesc a : anos){
                for(AnnotationDesc.ElementValuePair e : a.elementValues()){


                    if(e.element().name().equals("value")) {
                        name = (String)e.value().value();


                    }else if(e.element().name().equals("required")){
                        required = "required : " + e.value();
                    }
                }


                sb.append("<b>");
                sb.append(name);
                sb.append("</b>");
                sb.append("<br>");
                sb.append(required);
                sb.append("<br>");
                sb.append(pt.parameterComment());
                sb.append("<br>");

            }
        }

        return sb.toString();





    }

    private String getPath(MemberDoc m) {
        AnnotationDesc[] ads = m.annotations();
        for(AnnotationDesc ad : ads){
            // Annotation values
            if(ad.annotationType().name().equals("RequestMapping")){
                for(AnnotationDesc.ElementValuePair pair : ad.elementValues()){
                    if(pair.element().name().equals("value")){
                        return pair.value().toString();
                    }
                }

            }




        }
        return null;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("<td>");
        sb.append(this.mainMenu);
        sb.append("</td>");

        sb.append("<td>");
        sb.append(this.subMenu);
        sb.append("</td>");

        sb.append("<td>");
        sb.append(this.path);
        sb.append("</td>");

        sb.append("<td>");
        sb.append(this.param);
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

        sb.append("<td>");
        sb.append(this.func);
        sb.append("</td>");


        return sb.toString();
    }
}

