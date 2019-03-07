/*
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 *     http://duracloud.org/license/
 */
package org.duracloud.storage.domain;

public enum StorageProviderType {
    AMAZON_S3("amazon-s3"),
    AMAZON_GLACIER("amazon-glacier"),
    SWIFT_S3("swift-s3"),
    IRODS("irods"),
    CHRONOPOLIS("chronopolis"),
    UNKNOWN("unknown"),
    TEST_RETRY("test-retry"),
    TEST_VERIFY_CREATE("test-verify-create"),
    TEST_VERIFY_DELETE("test-verify-delete");

    private final String text;

    private StorageProviderType(String pt) {
        text = pt;
    }

    public static StorageProviderType fromString(String pt) {
        System.out.println("Running loop with: " + pt);
        for (StorageProviderType pType : values()) {
            System.out.println("On ptype: " + pType);
            if (pType.text.equalsIgnoreCase(pt) ||
                pType.name().equalsIgnoreCase(pt)) {
                System.out.println("Match found! " + pType);
                return pType;
            }
        }
        System.out.println("No match found. Returning unknown.");
        return StorageProviderType.UNKNOWN;
    }

    @Override
    public String toString() {
        return text;
    }

    public String getName() {
        return name();
    }
}
