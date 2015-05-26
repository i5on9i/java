package com;

import com.anno.*;

/**
 * Created by namh on 2015-05-23.
 */
public class Test {
    static final String REQ_TEST = "/req/test";

    /**
     *
     * ���⿡ ������ ������ ���´�. �̺κ��� �Լ� list ���� ���� �ϰ� ���� �ȴ�.
     *
     * ���� ���� �̾ �� �� �ڼ��� �̾߱⸦ ���´�.
     *
     * @t.mainmenu
     * ���� �׸�
     * @t.submenu
     * ���� �׸�
     *
     * @t.returnFields
     * <ul>
     * <li>data : <i>ref.data</i> ����</li>
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
     * @param id      ���� id
     * @param sDate       ��ȸ�ϰ� ���� ���� ��¥(date format : yyyyMMddHHmm)
     */

    @RequestMapping(value = Constant.REQ_TEST)
    public void test(

            @RequestParam(value = Contant.PARAM_ID, required = true) int id,
            HttpServletRequest request,
            HttpServletResponse response) {

    }


}
