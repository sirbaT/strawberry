package com.strawberry.master;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.AccessControlList;

/**
 * 例子如何访问OSS
 * Created by yaguang.wang
 * on 2017/5/18.
 */
public class TestAliRamServiceSample {
    private static String endpoint = ""; // http://oss-cn-hangzhou.aliyuncs.com
    private static String accessKeyId = ""; // xxxxxxxx
    private static String accessKeySecret = ""; //xxxxxxxxxxxxxx
    private static String bucketName = ""; // name
    private static String key = "";

    public static void main(String[] args) {
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        AccessControlList bucketAcl = ossClient.getBucketAcl(bucketName);
        System.out.println(ossClient);
        System.out.println(bucketAcl.getCannedACL());
    }
}
