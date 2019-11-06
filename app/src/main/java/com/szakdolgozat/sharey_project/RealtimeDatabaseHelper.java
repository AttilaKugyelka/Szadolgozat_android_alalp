package com.szakdolgozat.sharey_project;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RealtimeDatabaseHelper {

    FirebaseDatabase database=FirebaseDatabase.getInstance();


    public void setDataReference(Post post){
        DatabaseReference reference=database.getReference("Post");
        reference.child("PostName").setValue(post.getPostName());
        reference.child("PostDescRition").setValue(post.getDescription());
    }
}
