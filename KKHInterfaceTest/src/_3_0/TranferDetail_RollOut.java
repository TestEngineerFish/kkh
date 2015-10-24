package _3_0;

import com.kkh.helper.Helper;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lifengmei on 15/10/23.
 */
//转诊详情（转出）
public class TranferDetail_RollOut extends Helper{
    String doctor_id;
    String transfer_id;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        transfer_id = "488";

        urlPath = "/doctors/“ ＋ doctor_id ＋ ”/patient_transfer/“ ＋transfer_id ＋”/？";
        connection = super.httpURLConnectionGET(urlPath);
        Assert.assertTrue(errorMsg(connection), assertCode(connection));
    }
}
