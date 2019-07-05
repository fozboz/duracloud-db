/*
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 *     http://duracloud.org/license/
 */
package org.duracloud.account.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * A grab bag of global properties.
 *
 * @author Daniel Bernstein
 * Date: 01/05/2016
 */
@Entity
public class GlobalProperties extends BaseEntity {
    /*
     * an SNS topic arn for sending noticiations to the instances
     */
    @Column(nullable = false)
    private String instanceNotificationTopicArn;

    @Column(nullable = false)
    private String cloudFrontAccountId;

    @Column(nullable = false)
    private String cloudFrontKeyId;

    @Column(nullable = false)
    private String cloudFrontKeyPath;

    @Column(nullable = false)
    private String notifierType;

    @Column(nullable = false)
    private String rabbitmqHost;

    @Column(nullable = false)
    private String rabbitmqExchange;

    @Column(nullable = false)
    private String rabbitmqUsername;

    @Column(nullable = false)
    private String rabbitmqPassword;

    public String getInstanceNotificationTopicArn() {
        return instanceNotificationTopicArn;
    }

    public void setInstanceNotificationTopicArn(String instanceNotificationTopicArn) {
        this.instanceNotificationTopicArn = instanceNotificationTopicArn;
    }

    public String getCloudFrontAccountId() {
        return cloudFrontAccountId;
    }

    public void setCloudFrontAccountId(String cloudFrontAccountId) {
        this.cloudFrontAccountId = cloudFrontAccountId;
    }

    public String getCloudFrontKeyId() {
        return cloudFrontKeyId;
    }

    public void setCloudFrontKeyId(String cloudFrontKeyId) {
        this.cloudFrontKeyId = cloudFrontKeyId;
    }

    public String getCloudFrontKeyPath() {
        return cloudFrontKeyPath;
    }

    public void setCloudFrontKeyPath(String cloudFrontKeyPath) {
        this.cloudFrontKeyPath = cloudFrontKeyPath;
    }

    public String notifierType() {
        return notifierType;
    }

    public void setAuditQueueType(String notifierType) {
        this.notifierType = notifierType;
    }

    public String getRabbitmqHost() {
        return rabbitmqHost;
    }

    public void setRabbitmqHost(String rabbitmqHost) {
        this.rabbitmqHost = rabbitmqHost;
    }

    public String getRabbitmqExchange() { return rabbitmqExchange; }

    public void setRabbitmqExchange(String rabbitmqExchange) { this.rabbitmqExchange = rabbitmqExchange; }

    public String getRabbitmqUsername() { return rabbitmqUsername; }

    public void setRabbitmqUsername(String rabbitmqUsername) { this.rabbitmqUsername = rabbitmqUsername; }

    public String getRabbitmqPassword() { return rabbitmqPassword; }

    public void setRabbitmqPassword(String rabbitmqPassword) { this.rabbitmqPassword = rabbitmqPassword; }

}
