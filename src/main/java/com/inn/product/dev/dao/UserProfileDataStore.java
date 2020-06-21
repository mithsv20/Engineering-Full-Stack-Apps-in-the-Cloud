package com.inn.product.dev.dao;

import com.inn.product.dev.model.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("3dd29684-511b-4bb4-a310-3c989ee38891"), "Mithlesh", "bcad9652-dfd1-4ef1-8107-a7eeabd87982-mithlesh2.JPG"));
        USER_PROFILES.add(new UserProfile(UUID.fromString("8184d3c2-285f-4c15-8ebe-a480ecbaeb40"), "Krishankant", "624d9421-606b-45a9-a564-6b49dd80a42f-krishankant.JPG"));
        USER_PROFILES.add(new UserProfile(UUID.fromString("b636de35-fecc-45bb-b544-f342a6a7ed29"), "Archita", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("b780675a-d75c-475a-8a3c-eee43e496cd8"), "Nandita", "3ddba3df-d0d4-491b-8d1f-cb04abb9f021-nandita.JPG"));
        USER_PROFILES.add(new UserProfile(UUID.fromString("2cac016d-f3ad-4a7a-9e5f-99a7202cac64"), "Ayushi", "54679b88-6e38-472e-99ba-b945add42134-ayushi.JPG"));
        USER_PROFILES.add(new UserProfile(UUID.fromString("8d411b4c-dbdd-4d58-b50d-0f766c493615"), "Rishav", "4e0e219d-b845-4b9c-8b4d-92bdcbaebfd2-rishav.JPG"));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
