import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;




/**
 * Created by namh on 2015-05-16.
 */
public class UtilTest {
//    @Mock private MapTest map;



    @Test
    public void testMap() throws InvocationTargetException, IllegalAccessException {


        MapTest mt = mock(MapTest.class);
        when(mt.getNum()).thenReturn(1);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Num", 10);
        when(mt.toMap()).thenReturn(map);


        MapTest realMt = new MapTest();
        assertEquals(10, mt.toMap().get("Num"));
        assertEquals(mt.toMap().get("Num"), realMt.toMap().get("Num"));


    }



}
