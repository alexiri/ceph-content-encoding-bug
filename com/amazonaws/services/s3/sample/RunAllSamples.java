package com.amazonaws.services.s3.sample;

public class RunAllSamples {

    /** Put your access key here **/
    private static final String awsAccessKey = "xxx";
    
    /** Put your secret key here **/
    private static final String awsSecretKey = "xxx";
    
    /** Put your bucket name here **/
    private static final String bucketName = "oracle-data-miroslav-1";
    
    /** The name of the region where the bucket is created. (e.g. us-west-1) **/
    private static final String regionName = "us-east-1";
    
    private static final String endPoint = "http://s3.amazonaws.com";

    /*private static final String awsAccessKey = "xxx";
    private static final String awsSecretKey = "xxx";
    private static final String bucketName = "oracle-data-miropoto-1";
    private static final String endPoint = "http://ceph.ceph";*/
    
    /**
     * Run all the included samples. Before running the samples, you need to
     * specify the bucket name, region name and your credentials.
     */
    public static void main(String[] args) {
        
        //PutS3ObjectSample.putS3Object(bucketName, regionName, awsAccessKey, awsSecretKey);
        
        //GetS3ObjectSample.getS3Object(bucketName, regionName, awsAccessKey, awsSecretKey);

        //PresignedUrlSample.getPresignedUrlToS3Object(bucketName, regionName, awsAccessKey, awsSecretKey);

        PutS3ObjectChunkedSample.putS3ObjectChunked(endPoint, bucketName, regionName, awsAccessKey, awsSecretKey);

        GetS3ObjectSample.getS3Object(endPoint, bucketName, regionName, awsAccessKey, awsSecretKey);

    }

}
