package com;

import com.anno.*;

/**
 * Created by namh on 2015-05-23.
 */
public class Test {
    static final String REQ_TEST = "/req/test";

    /**
     *
     * 여기에 간단한 설명을 적는다. 이부분은 함수 list 에도 간략 하게 들어가게 된다.
     *
     * 위의 설명에 이어서 좀 더 자세한 이야기를 적는다.
     *
     * @t.mainmenu
     * 메인 항목
     * @t.submenu
     * 서브 항목
     *
     * @t.returnFields
     * <ul>
     * <li>data : <i>ref.data</i> 참조</li>
     * </ul>
     *
     *
     * @t.returnExample
     * <pre><code>
     * "data": {
     *     "test" : 10
     * }
     * </code></pre>
     *
     * @param id      나의 id
     * @param sDate       조회하고 싶은 시작 날짜(date format : yyyyMMddHHmm)
     */

    @RequestMapping(value = Constant.REQ_TEST)
    public void test(

            @RequestParam(value = Contant.PARAM_ID, required = true) int id,
            HttpServletRequest request,
            HttpServletResponse response) {

    }


}
