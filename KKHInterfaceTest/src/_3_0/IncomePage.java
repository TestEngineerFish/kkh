package _3_0;

import com.kkh.helper.Helper;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lifengmei on 15/10/23.
 */
//医生获取我的收入分页
public class IncomePage extends Helper{
    String after_pk;
    String offset;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        after_pk = "0";
        offset = "20";
        urlPath = "/doctors/" + doctor_id + "/incomes/?" + "after_pk=" + after_pk + "&offset=" + offset + "&";
        connection = super.httpURLConnectionGET(urlPath);
        Assert.assertTrue(errorMsg(connection), assertCode(connection));
    }
}
