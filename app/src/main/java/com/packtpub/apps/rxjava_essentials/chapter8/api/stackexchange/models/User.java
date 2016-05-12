package com.packtpub.apps.rxjava_essentials.chapter8.api.stackexchange.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class User {

    @SerializedName("badge_counts")
    @Expose
    private BadgeCounts badgeCounts;

    @SerializedName("account_id")
    @Expose
    private Integer accountId;

    @SerializedName("is_employee")
    @Expose
    private Boolean isEmployee;

    @SerializedName("last_modified_date")
    @Expose
    private Integer lastModifiedDate;

    @SerializedName("last_access_date")
    @Expose
    private Integer lastAccessDate;

    @SerializedName("reputation_change_year")
    @Expose
    private Integer reputationChangeYear;

    @SerializedName("reputation_change_quarter")
    @Expose
    private Integer reputationChangeQuarter;

    @SerializedName("reputation_change_month")
    @Expose
    private Integer reputationChangeMonth;

    @SerializedName("reputation_change_week")
    @Expose
    private Integer reputationChangeWeek;

    @SerializedName("reputation_change_day")
    @Expose
    private Integer reputationChangeDay;

    @Expose
    private Integer reputation;

    @SerializedName("creation_date")
    @Expose
    private Integer creationDate;

    @SerializedName("user_type")
    @Expose
    private String userType;

    @SerializedName("user_id")
    @Expose
    private Integer userId;

    @Expose
    private Integer age;

    @Expose
    private String location;

    @SerializedName("website_url")
    @Expose
    private String websiteUrl;

    @Expose
    private String link;

    @SerializedName("display_name")
    @Expose
    private String displayName;

    @SerializedName("profile_image")
    @Expose
    private String profileImage;

    public BadgeCounts getBadgeCounts() {
        return badgeCounts;
    }

    public Boolean getEmployee() {
        return isEmployee;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public Integer getReputationChangeYear() {
        return reputationChangeYear;
    }

    public Integer getLastModifiedDate() {
        return lastModifiedDate;
    }

    public Integer getLastAccessDate() {
        return lastAccessDate;
    }

    public Integer getReputationChangeQuarter() {
        return reputationChangeQuarter;
    }

    public Integer getReputationChangeWeek() {
        return reputationChangeWeek;
    }

    public Integer getReputationChangeDay() {
        return reputationChangeDay;
    }

    public Integer getCreationDate() {
        return creationDate;
    }

    public Integer getReputation() {
        return reputation;
    }

    public String getUserType() {
        return userType;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public String getLink() {
        return link;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getProfileImage() {
        return profileImage;
    }
}