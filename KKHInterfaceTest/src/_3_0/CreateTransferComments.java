package _3_0;

import com.kkh.helper.Helper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by lifengmei on 15/10/22.
 */
//评价我的转诊
public class CreateTransferComments extends Helper {
    String rating;
    String content;
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
        rating = "1";
        content = "医术高明，妙手回春，医生长的很帅哦!";
        receive_doctor_id = "300952";
        transfer_id = "486";

        map.put("rating", rating);
        map.put("content", content);

        urlPath = "/doctors/" + receive_doctor_id + "/patient_receive/" + transfer_id+ "/comments/create/";

        connection = super.httpURLConnectionPOST(urlPath, map);

        org.junit.Assert.assertTrue(errorMsg(connection), assertCode(connection));
    }
}

