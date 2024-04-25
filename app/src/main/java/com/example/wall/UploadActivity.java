package com.example.wall;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class UploadActivity extends AppCompatActivity{

    private Button buttonPost;
    private GridView gridViewGallery;
    private ImageView imageViewZoomed;
    private static final int REQUEST_CODE_SELECT_IMAGE = 100;
    private ActivityResultLauncher<String> galleryLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        // Initialize UI
        buttonPost = findViewById(R.id.buttonPost);
        gridViewGallery = findViewById(R.id.gridViewGallery);
        imageViewZoomed = findViewById(R.id.imageViewZoomed);

        buttonPost.setOnClickListener(v -> {
            // TODO: handle post button clicked
            Toast.makeText(UploadActivity.this, "Post button clicked", Toast.LENGTH_SHORT).show();
        });

        gridViewGallery.setOnItemClickListener((parent, view, position, id) -> {
            // TODO: Handle gallery item clicks
            Toast.makeText(UploadActivity.this, "Image selected from gallery", Toast.LENGTH_SHORT).show();
        });

        galleryLauncher = registerForActivityResult(new ActivityResultContracts.GetContent(), result ->{
            // TODO: Handle selected image
            imageViewZoomed.setImageURI(result);
            imageViewZoomed.setVisibility(View.VISIBLE);
        });

        startGalleryIntent();
    }

    /**
     * Method to start gallery intent.
     * */
    private void startGalleryIntent() {
        galleryLauncher.launch("image/*");
    }
}

























