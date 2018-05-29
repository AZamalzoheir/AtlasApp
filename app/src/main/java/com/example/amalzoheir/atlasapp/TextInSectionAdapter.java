package com.example.amalzoheir.atlasapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class TextInSectionAdapter extends RecyclerView.Adapter<TextInSectionAdapter.TextInSectionViewHolder>{
    private List<TextAtlasInSections> textAtlasInSectionsList;
    public class TextInSectionViewHolder extends RecyclerView.ViewHolder {
        public TextView dataInSectionTextView;
        public ImageView iconImageView;
        public TextInSectionViewHolder(View view) {
            super(view);
          dataInSectionTextView=(TextView)view.findViewById(R.id.data_in_section_tv);
          iconImageView=(ImageView)view.findViewById(R.id.icon_image_view);
        }
    }
    public TextInSectionAdapter(List<TextAtlasInSections> textAtlasInSectionsList){
        this.textAtlasInSectionsList=textAtlasInSectionsList;
    }

    @Override
    public TextInSectionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView=LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new TextInSectionViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TextInSectionViewHolder holder, int position) {
        TextAtlasInSections currentTextAtlasInSections=textAtlasInSectionsList.get(position);
        holder.dataInSectionTextView.setText(currentTextAtlasInSections.getDataAboutSection());
        if(currentTextAtlasInSections.hasImage()){
            holder.iconImageView.setImageResource(currentTextAtlasInSections.getImageSourceNumber());
            holder.iconImageView.setVisibility(View.VISIBLE);
        }
        else
        {
            holder.iconImageView.setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        return textAtlasInSectionsList.size();
    }
}