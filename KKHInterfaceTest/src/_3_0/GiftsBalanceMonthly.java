package _3_0;

import com.kkh.helper.Helper;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lifengmei on 15/10/23.
 */
//获取苹果账户当月详情强制分页拉取
public class GiftsBalanceMonthly extends Helper {
    String gift_pk;
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
        gift_pk = "1";
        after_pk = "0";
        offset = "20";

        urlPath = "/doctors/" + doctor_id + "/gifts/monthly/?" + "gift_pk=" + gift_pk + "&after_pk=" + after_pk + "&offset=" + offset + "&";
        connection = super.httpURLConnectionGET(urlPath);
        Assert.assertTrue(errorMsg(connection), assertCode(connection));
    }
}
