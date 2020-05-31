package com.inn.product.dev.buckets;

public enum BucketName {

    PROFILE_IMAGE("intelicode-image-upload-123");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
