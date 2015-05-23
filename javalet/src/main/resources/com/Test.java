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
     *
     * @t.url /test/url
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

    @RequestMapping(value = REQ_TEST)
    public void test(String id, String sDate){
     
    }
}
