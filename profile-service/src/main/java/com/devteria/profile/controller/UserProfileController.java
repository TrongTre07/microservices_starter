package com.devteria.profile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devteria.profile.dto.request.ProfileCreationRequest;
import com.devteria.profile.dto.response.UserProfileResponse;
import com.devteria.profile.service.UserProfileService;

import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Controller
@RequiredArgsConstructor
@RestController
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public class UserProfileController {

    UserProfileService userProfileService;

    @PostMapping("/create")
    UserProfileResponse createUserProfile(@RequestBody ProfileCreationRequest entity) {
        return userProfileService.createUserProfile(entity);
    }

    @GetMapping("/{userProfileId}")
    UserProfileResponse getMethodName(@PathVariable String userProfileId) {
        return userProfileService.getUserProfile(userProfileId);
    }
}
