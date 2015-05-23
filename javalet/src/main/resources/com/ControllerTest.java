package com;

/**
 * Created by namh on 2015-05-23.
 */
public class ControllerTest {
    /**
     *
     * ���⿡ ������ ������ ���´�. �̺κ��� �Լ� list ���� ���� �ϰ� ���� �ȴ�.
     *
     * ���� ���� �̾ �� �� �ڼ��� �̾߱⸦ ���´�.
     *
     *
     * @t.url /test/url
     *
     * @t.returnField
     * <ul>
     * <li>data : <i>ref.data</i> ����</li>
     * </ul>
     *
     *
     * <p><em>Example</em></p>
     * <pre><code>
     * "data": {
     *     "test" : 10
     * }
     * </code></pre>
     *
     * @param id      ���� id
     * @param sDate       ��ȸ�ϰ� ���� ���� ��¥(date format : yyyyMMddHHmm)
     */

    @RequestMapping(value = "/request/test")
    public void test(
            @RequestParam(value = NewStatsParamKey.USVC_ID, required = true) int usvcId,
            String id, String sDate){
     
    }
}
