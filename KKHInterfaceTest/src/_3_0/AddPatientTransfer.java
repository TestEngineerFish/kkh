package _3_0;

import com.kkh.helper.Helper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by lifengmei on 15/10/23.
 */
//创建病人转诊
public class AddPatientTransfer extends Helper{
    String patient_pk;
    String to_doctor_pk;
    String note_message;

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
        patient_pk = "2905";
        note_message = "这是测试的病人哦，😄";

        map.put("patient_pk",patient_pk);
        map.put("to_doctor_pk",to_doctor_pk);
        map.put("note_message",note_message);

        urlPath = "/doctors/" + doctor_id + "/patient_transfer/";
        connection = super.httpURLConnectionPOST(urlPath, map);
        String message = errorMsg(connection);
        System.out.print(message);
        Assert.assertTrue(message, assertCode(connection));
    }

}
