import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by namh on 2015-05-16.
 */
public class MapTest {
    private int num = 10;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }



    public Map<String, Object> toMap() throws InvocationTargetException, IllegalAccessException {

        Method[] methods = this.getClass().getMethods();
        Map<String, Object> map = new HashMap<String, Object>();
        for(Method m : methods)
        {
            if(m.getName().startsWith("get"))
            {
                map.put(m.getName().substring(3), m.invoke(this));
            }
        }

        return map;
    }
}
