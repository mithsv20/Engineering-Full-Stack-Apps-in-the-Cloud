package com.inn.product.dev.dao;

import com.inn.product.dev.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService {

    @Autowired
    UserProfileDataStore userProfileDataStore;

    public List<UserProfile> getUserProfiles() {
        return userProfileDataStore.getUserProfiles();
    }
}
