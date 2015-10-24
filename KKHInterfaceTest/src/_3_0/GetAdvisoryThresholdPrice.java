package _3_0;

import com.kkh.helper.Helper;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lifengmei on 15/10/23.
 */
//获取医生图文咨询服务收费设置
public class GetAdvisoryThresholdPrice extends Helper{
    String service_code;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void test() throws Exception {
        service_code = "MSG";
        patient_id = "2896";
        urlPath = "/doctors/" + doctor_id + "/services/" + service_code + "/followers/" + patient_id + "/?";
        connection = super.httpURLConnectionGET(urlPath);
        Assert.assertTrue(errorMsg(connection), assertCode(connection));
    }
}
