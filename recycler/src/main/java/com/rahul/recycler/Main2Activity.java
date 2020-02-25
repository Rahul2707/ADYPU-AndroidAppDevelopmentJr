package com.rahul.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    int[] images;
    String[] names;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView = findViewById(R.id.recycler_view);
        images = new int[]{R.drawable.ic_facebook, R.drawable.ic_instagram_sketched, R.drawable.ic_linkedin, R.drawable.ic_skype, R.drawable.ic_youtube};
        names = new String[]{"Facebook", "Instagram", "Linkdin", "Skype", "Youtube"};

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(Main2Activity.this);
        SocialAdaptor adaptor = new SocialAdaptor(Main2Activity.this,getList(images,names));
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(adaptor);
    }
    private List<Socialversion> getList(int[] images,String[] names){

    List<Socialversion> list=new ArrayList<>();
    for (int i=0; i<images.length;i++){
        Socialversion version=new Socialversion();
        version.setImage((images[i]));
        version.setName(names[i]);
        list.add(version);
    }
    return list;}
}
