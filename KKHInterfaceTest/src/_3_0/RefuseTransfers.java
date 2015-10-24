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
public class RefuseTransfers extends Helper {
    String receive_doctor_id;
    String transfer_id;
    String decline_message;
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
        receive_doctor_id = "300952";
        transfer_id = "489";
        decline_message = "我不看大人的病哦，😄";

        map.put("decline_message", decline_message);

        urlPath = "/doctors/" + receive_doctor_id + "/patient_receive/" + transfer_id + "/decline/";
        connection = super.httpURLConnectionPOST(urlPath, map);
        Assert.assertTrue(errorMsg(connection), assertCode(connection));
    }
}
