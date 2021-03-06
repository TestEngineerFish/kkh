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
//标记转诊已读（转出）
public class MarkReadTransfer_RollOut extends Helper {
    String to_doctor_pk;
    String receive_doctor_id;
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
        to_doctor_pk = "300952";
        receive_doctor_id = "300952";
        transfer_id = "488";
        map.put("to_doctor_pk",to_doctor_pk);

        urlPath = "/doctors/" + receive_doctor_id + "/patient_transfer/" + transfer_id + "/ack/read/";
        connection = super.httpURLConnectionPOST(urlPath, map);
        Assert.assertTrue(errorMsg(connection), assertCode(connection));
    }
}
