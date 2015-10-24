package _3_0;

import com.kkh.helper.Helper;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lifengmei on 15/10/23.
 */
//转诊详情（转入）
public class TranferDetail_Receive extends Helper {
    String transfer_id;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        transfer_id = "490";
        urlPath = "/doctors/“ ＋ doctor_id ＋ ”/patient_receive/“ ＋transfer_id ＋”/？";
        connection = super.httpURLConnectionGET(urlPath);
        Assert.assertTrue(errorMsg(connection), assertCode(connection));
    }
}
