package cn.hwh.tikhandle.test;

import com.alibaba.fastjson.JSON;
import com.qiniu.common.QiniuException;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.model.FileInfo;
import com.qiniu.util.Auth;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author hwh
 * @description:
 * @create 2023-11-04 9:47
 */
@SpringBootTest
public class TestVideoPlay {

    private static final String QiNiuAccessKey="Sb8CA99fxd1AOa4TPhy7GY9T00VpHG8McMGmQe_z";

    private static final String QiNiuSecretKey="TIqfEOrSKPTNb-awXGPNSeJBsUwx1y1Ji8DcKMZZ";
    private static final String bucket="tik-handle";

    @Test
    public void test_01(){
        Configuration cfg = new Configuration(Region.region0());
        Auth auth = Auth.create(QiNiuAccessKey, QiNiuSecretKey);
        BucketManager bucketManager = new BucketManager(auth, cfg);
        try {
            FileInfo fileInfo = bucketManager.stat(bucket, "test.mp4");
            System.out.println(fileInfo.hash);
            System.out.println(fileInfo.fsize);
            System.out.println(fileInfo.mimeType);
            System.out.println(fileInfo.putTime);
            System.out.println(JSON.toJSONString(fileInfo));
        } catch (QiniuException ex) {
            System.err.println(ex.response.toString());
        }
    }
}
