/**
 * Copyright FMR LLC <opensource@fidelity.com>
 * SPDX-License-Identifier: Apache-2.0
 */

package io.jenkins.plugins.cdevents.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Date;

public class JobModel implements Serializable {

    private static final String JENKINS_SOURCE = "org.jenkinsci.job.";
    private String userId;
    private String userName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;
    private String name;
    private String displayName;
    private String url;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BuildModel build;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date createdDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date updatedDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String configFile;
    @JsonIgnore
    private String stage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BuildModel getBuild() {
        return build;
    }

    public void setBuild(BuildModel build) {
        this.build = build;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getConfigFile() {
        return configFile;
    }

    public void setConfigFile(String configFile) {
        this.configFile = configFile;
    }

}