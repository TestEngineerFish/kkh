package _3_0;

import com.kkh.helper.Helper;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lifengmei on 15/10/22.
 */
//医生详情显示转诊小红点 ／ 医生 苹果余额
public class PatientTransfers_RedDot extends Helper{
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void test() throws Exception {

        urlPath = "/doctors/"+ doctor_id+"/?";
        connection = super.httpURLConnectionGET(urlPath);
        Assert.assertTrue(errorMsg(connection), assertCode(connection));
    }

}
