package com.example.Meat.domain.util;

import com.example.Meat.domain.User;

public abstract class MessageHelper {
    public static String getAuthorName(User author){
        return author != null ? author.getUsername() : "<аноним>";
    }
}
