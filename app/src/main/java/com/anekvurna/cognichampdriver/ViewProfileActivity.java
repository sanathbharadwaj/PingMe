package com.anekvurna.cognichampdriver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);

       /* getTextView(R.id.view_name).setText(currentProfile.getName());
        getTextView(R.id.view_address).setText(currentProfile.getAddress());
        getTextView(R.id.view_mobile).setText(currentProfile.getMobile());
        getTextView(R.id.view_email).setText(currentProfile.getEmail());
        getTextView(R.id.view_alternate).setText(currentProfile.getAlternateMobile());
        getTextView(R.id.view_landline).setText(currentProfile.getLandline());*/

        ImageView imageView = (ImageView) findViewById(R.id.view_image);

    }



    public TextView getTextView(int id) {
        return (TextView) findViewById(id);
    }
}
