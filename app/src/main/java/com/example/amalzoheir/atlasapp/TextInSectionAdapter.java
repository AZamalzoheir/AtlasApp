package com.example.amalzoheir.atlasapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class TextInSectionAdapter extends ArrayAdapter<TextAtlasInSections> {
   public TextInSectionAdapter(Activity context, ArrayList<TextAtlasInSections> textAtlasInSections){
       super(context,0,textAtlasInSections);

   }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View listItemView=convertView;
       if(listItemView==null){
           listItemView= LayoutInflater.from(getContext()).inflate(
                   R.layout.list_item, parent, false);
       }
       TextAtlasInSections currentTextAtlasInSections= getItem(position);//get current element in list
        TextView dataInSectionsTextView=(TextView)listItemView.findViewById(R.id.data_in_section_tv);//get text view from listitem view
        dataInSectionsTextView.setText(currentTextAtlasInSections.getDataAboutSection());
        ImageView iconImageView=(ImageView)listItemView.findViewById(R.id.icon_image_view);
        if(currentTextAtlasInSections.hasImage()){
            iconImageView.setImageResource(currentTextAtlasInSections.getImageSourceNumber());
            iconImageView.setVisibility(View.VISIBLE);
        }
        else
        {
            iconImageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
