package _3_0;

import com.kkh.helper.Helper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by lifengmei on 15/10/22.
 */
//标记转诊已读（转入）
public class MarkReadTranfer_Receive extends Helper {

    String transfer_id;
    @Before
    public void setUp() throws Exception {
        map = new HashMap<String, String>();
    }

    @After
    public void tearDown() throws Exception {
        map.clear();
    }
    @Test
    public void test() throws Exception {

        transfer_id = "490";

        urlPath = "/doctors/" + doctor_id + "/patient_receive/" + transfer_id + "/ack/read/";
        connection = super.httpURLConnectionPOST(urlPath, null);
        Assert.assertTrue(errorMsg(connection), assertCode(connection));
    }
}
